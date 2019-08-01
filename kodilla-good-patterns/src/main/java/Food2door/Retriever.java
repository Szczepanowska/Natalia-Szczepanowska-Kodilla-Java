package Food2door;

public class Retriever {
public ProductOrder retrieve(){
    Provider provider = new Provider("ExtraFoodShop");
    ProductOrder productOrder = new ProductOrder(provider, 55, "avocados");

    return productOrder;
}
}
