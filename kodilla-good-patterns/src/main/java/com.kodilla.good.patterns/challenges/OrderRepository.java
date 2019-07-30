package com.kodilla.good.patterns.challenges;

public interface OrderRepository {
    boolean create(ProductOrder productOrder, User user);
}
