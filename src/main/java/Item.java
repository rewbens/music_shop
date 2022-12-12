public abstract class Item {

    private String name;
    private double purchasePrice;
    private double priceSold;

    public Item(String name, double purchasePrice, double priceSold) {
        this.name = name;
        this.purchasePrice = purchasePrice;
        this.priceSold = priceSold;
    }

    public String getName() {
        return name;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public double getSoldPrice() {
        return priceSold;
    }
}
