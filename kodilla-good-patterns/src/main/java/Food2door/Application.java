package Food2door;

public class Application {
    public static void main (String[] args){

Product product1 = new Product("avocados", 7);
Product product2 = new Product("tumeric", 1);
Product product3 = new Product("rice noodle", 16);
Product product4= new Product("chia seeds", 116);

Item item1 = new Item(product1, 55);
Item item2 = new Item(product2, 2);
Item item3 = new Item(product3, 5);
Item item4 = new Item(product4, 155);

        Order order = new Order();
        order.orderPocess(new ExtraFoodShop(), item1);
        order.orderPocess(new ExtraFoodShop(), item2);
        order.orderPocess(new GlutenFreeShop(), item3);
        order.orderPocess(new HealthyShop(), item4);



    }
}