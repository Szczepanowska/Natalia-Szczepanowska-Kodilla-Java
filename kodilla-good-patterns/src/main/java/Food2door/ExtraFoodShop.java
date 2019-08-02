package Food2door;

public class ExtraFoodShop implements Provider {

    @Override
    public boolean process(Item item) {
        System.out.println("Order from ExtraFoodShop");
        return true;
    }
}
