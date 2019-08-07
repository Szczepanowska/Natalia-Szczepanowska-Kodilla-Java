package Food2door;

import java.util.List;

public class OrderProcessor {

    public void orderPocess(Provider provider, List<Item> itemList) {
        boolean ordered = provider.process(itemList);
        if (ordered) {
            System.out.println(" Your order is created.");
        } else {
            System.out.println("This order could not been created.");
        }
    }
}
