package vehicles;

public class Car extends LandVehicle implements Drivable, Maintainable, Fuelable {
    private int fuelLevel;
    private int numberOfDoors;

    public Car(String id, String brand, int wheelCount, int topSpeed, int numberOfDoors) {
        super(id, brand, wheelCount, topSpeed);
        this.numberOfDoors = numberOfDoors;
        this.fuelLevel = 0;
    }

    public int getFuelLevelField() { return fuelLevel; }
    public void setFuelLevelField(int fuelLevel) { this.fuelLevel = fuelLevel; }
    public int getNumberOfDoors() { return numberOfDoors; }
    public void setNumberOfDoors(int numberOfDoors) { this.numberOfDoors = numberOfDoors; }

    @Override
    public void refuel(int amount) { fuelLevel += amount; }
    @Override
    public int getFuelLevel() { return fuelLevel; }
    @Override
    public boolean isTankEmpty() { return fuelLevel <= 0; }

    @Override
    public String startEngine() { return getMake() + " car engine started."; }
    @Override
    public String stopEngine() { return getMake() + " car engine stopped."; }
    @Override
    public void accelerate(int amount) { }

    @Override
    public String inspect() { return "Inspecting " + getMake() + " car."; }
    @Override
    public String repair() { return getMake() + " car repaired."; }
    @Override
    public boolean needsService() { return getTopSpeed() < 0; }

    @Override
    public String vehicleType() { return "Car"; }

    @Override
    public String describe() {
        return "Car " + getMake() + " | doors:" + numberOfDoors + " | fuel:" + fuelLevel;
    }
}