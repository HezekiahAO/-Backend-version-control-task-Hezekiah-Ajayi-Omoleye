package vehicles;

public interface Fuelable {
    void refuel(int amount);
    int getFuelLevel();
    boolean isTankEmpty();
}