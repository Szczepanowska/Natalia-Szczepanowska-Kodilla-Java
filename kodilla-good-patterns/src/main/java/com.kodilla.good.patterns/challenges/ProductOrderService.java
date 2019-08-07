package com.kodilla.good.patterns.challenges;

public class ProductOrderService implements OrderService {


    public boolean order(User user, ProductOrder productOrder) {
        System.out.println("OrderProcessor of : " + productOrder.getNameOfProduct() + ", number: " + productOrder.getNumberOfOrder() + ", ordered by: " + user.getName() + " " + user.getSurname() + " accomplished.");
        return true;
    }
}
