package com.kodilla.good.patterns.challenges;

public class OrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService, final OrderService orderService, final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderRepository.create(orderRequest.getProductOrder(), orderRequest.getUser());

        if (isOrdered) {
            informationService.inform(orderRequest.getProductOrder());
            orderService.order(orderRequest.getUser(), orderRequest.getProductOrder());

            return new OrderDto(orderRequest.getUser(), orderRequest.getProductOrder(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), orderRequest.getProductOrder(), false);
        }
    }

}
