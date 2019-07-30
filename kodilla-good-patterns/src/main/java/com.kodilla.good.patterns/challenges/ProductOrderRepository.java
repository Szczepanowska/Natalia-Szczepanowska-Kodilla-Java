package com.kodilla.good.patterns.challenges;

public class ProductOrderRepository implements OrderRepository{

   public boolean create(ProductOrder productOrder, User user){
        System.out.println("Create order : " + productOrder.getNameOfProduct() + ", number: " + productOrder.getNumberOfOrder() + " for: " + user.toString());
        return true;
    }

    }



