package Food2door;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        Product product1 = new Product("avocados", 7);
        Product product2 = new Product("tumeric", 1);
        Product product3 = new Product("rice noodle", 16);
        Product product4 = new Product("chia seeds", 116);

        Item item1 = new Item(product1, 55);
        Item item2 = new Item(product2, 2);
        Item item3 = new Item(product3, 5);
        Item item4 = new Item(product4, 155);

        List<Item> itemsList1 = new ArrayList<>();
        itemsList1.add(item1);
        itemsList1.add(item2);
        itemsList1.add(item4);

        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.orderPocess(new ExtraFoodShop(), itemsList1);




    }
}