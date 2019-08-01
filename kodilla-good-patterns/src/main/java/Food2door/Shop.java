package Food2door;

public class Shop implements OrderCreator {

  @Override
    public void process(ProductOrder productOrder) {
        System.out.println( "Order: " +productOrder.getAmount() + " " + productOrder.getProduct() + " by: " + productOrder.getProvider() + " created." );

    }
}
