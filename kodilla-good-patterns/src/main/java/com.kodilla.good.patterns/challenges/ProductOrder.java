package com.kodilla.good.patterns.challenges;

public class ProductOrder {
    private int numberOfOrder;
    private String nameOfProduct;

    public ProductOrder(int numberOfOrder, String nameOfProduct) {
        this.numberOfOrder = numberOfOrder;
        this.nameOfProduct = nameOfProduct;
    }

    public int getNumberOfOrder() {
        return numberOfOrder;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    @Override
    public String toString() {
        return "ProductOrder{" +
                "numberOfOrder=" + numberOfOrder +
                ", nameOfProduct='" + nameOfProduct + '\'' +
                '}';
    }
}
