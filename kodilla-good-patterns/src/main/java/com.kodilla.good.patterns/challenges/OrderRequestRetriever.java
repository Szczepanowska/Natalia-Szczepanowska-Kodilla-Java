package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user = new User("C.S", "Lewis");

        ProductOrder productOrder = new ProductOrder(007, "Wardrobe");

        LocalDate dateOfOrder = LocalDate.of(1950, 12, 1);

        return new OrderRequest(user, productOrder, dateOfOrder);

    }
}
