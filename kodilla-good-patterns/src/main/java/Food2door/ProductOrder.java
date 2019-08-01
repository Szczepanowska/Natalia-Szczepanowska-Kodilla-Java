package Food2door;

public class ProductOrder {
    private Provider provider;
    private int amount;
    private String product;

    public ProductOrder(Provider provider, int amount, String product) {
        this.provider = provider;
        this.amount = amount;
        this.product = product;
    }

    public Provider getProvider() {
        return provider;
    }

    public int getAmount() {
        return amount;
    }

    public String getProduct() {
        return product;
    }
}

