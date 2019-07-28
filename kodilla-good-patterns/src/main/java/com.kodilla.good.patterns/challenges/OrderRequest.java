package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderRequest {
    private User user;
    private ProductOrder productOrder;
    private LocalDate dateOfOrder;

    public OrderRequest(User user, ProductOrder productOrder, LocalDate dateOfOrder) {
        this.user = user;
        this.productOrder = productOrder;
        this.dateOfOrder = dateOfOrder;
    }

    public User getUser() {
        return user;
    }

    public ProductOrder getProductOrder() {
        return productOrder;
    }

    public LocalDate getDateOfOrder() {
        return dateOfOrder;
    }
}
