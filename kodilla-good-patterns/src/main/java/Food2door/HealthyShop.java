package Food2door;

public class HealthyShop implements Provider {

    @Override
    public boolean process(Item item) {
        System.out.println("Order from HealthyShop");
        return true;
    }
}
