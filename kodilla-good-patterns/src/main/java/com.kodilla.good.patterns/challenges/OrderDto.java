package com.kodilla.good.patterns.challenges;

public class OrderDto {
    public User user;
    public ProductOrder productOrder;
    public boolean isOrdered;

    public OrderDto(final User user, final ProductOrder productOrder, final boolean isOrdered) {
        this.user = user;
        this.productOrder = productOrder;
        this.isOrdered = isOrdered;
    }

    public User getUser() {
        return user;
    }

    public ProductOrder getProductOrder() {
        return productOrder;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
