package Food2door;

public class Application {
    public static void main (String[] args){

Retriever retriever = new Retriever();
ProductOrder productOrder = retriever.retrieve();

Shop shop = new Shop();
shop.process(productOrder);

    }
}