package Food2door;

import java.util.List;

public class ExtraFoodShop implements Provider {

    @Override
    public boolean process(List<Item> itemList) {
        System.out.println("OrderProcessor from ExtraFoodShop");
        return true;
    }
}
