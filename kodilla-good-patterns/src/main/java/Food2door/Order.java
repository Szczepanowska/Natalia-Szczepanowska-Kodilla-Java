package Food2door;

public class Order {

    public void orderPocess(Provider provider, Item item) {
        boolean ordered = provider.process(item);
        if (ordered) {
            System.out.println(" Your order is created.");
        } else {
            System.out.println("This order could not been created.");
        }
    }
}
