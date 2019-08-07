package com.kodilla.good.patterns.challenges;

public class ProductInformationService implements InformationService {

    public boolean inform(ProductOrder productOrder) {
        System.out.println("OrderProcessor of : " + productOrder.getNameOfProduct() + ", number: " + productOrder.getNumberOfOrder() + " is in progress.");
        return true;
    }


}
