package Food2door;

import java.util.List;

public class GlutenFreeShop implements Provider {
    @Override
    public boolean process(List<Item> itemList) {
        System.out.println("OrderProcessor from GlutenFreeShop");
        return false;
    }
}
