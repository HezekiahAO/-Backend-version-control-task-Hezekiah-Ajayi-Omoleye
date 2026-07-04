package vehicles;

public interface Sellable {
    double getPrice();
    void applyDiscount(double percent);
    String listForSale();
}
