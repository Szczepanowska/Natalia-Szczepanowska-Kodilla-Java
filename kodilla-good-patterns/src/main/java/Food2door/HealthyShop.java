package Food2door;

import java.util.List;

public class HealthyShop implements Provider {

    @Override
    public boolean process(List<Item> itemList) {
        System.out.println("OrderProcessor from HealthyShop");
        return true;
    }
}
