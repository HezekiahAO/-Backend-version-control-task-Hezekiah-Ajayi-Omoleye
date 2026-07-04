package vehicles;

public class Dealership implements Sellable {
    private String dealershipName;
    private double price;

    public Dealership(String dealershipName, double price) {
        this.dealershipName = dealershipName;
        this.price = price;
    }

    public String getDealershipName() { return dealershipName; }
    public void setDealershipName(String dealershipName) { this.dealershipName = dealershipName; }
    public double getPriceField() { return price; }
    public void setPriceField(double price) { this.price = price; }

    @Override
    public double getPrice() { return price; }
    @Override
    public void applyDiscount(double percent) { price -= price * (percent / 100); }
    @Override
    public String listForSale() { return dealershipName + " listing at $" + price; }
}