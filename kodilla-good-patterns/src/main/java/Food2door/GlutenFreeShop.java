package Food2door;

public class GlutenFreeShop implements Provider {
    @Override
    public boolean process(Item item) {
        System.out.println("Order from GlutenFreeShop");
        return false;
    }
}
