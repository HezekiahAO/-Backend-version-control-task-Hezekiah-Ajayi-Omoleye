package vehicles;

public class Motorcycle extends LandVehicle implements Drivable, Maintainable, Fuelable {
    private boolean hasSidecar;
    private int engineCC;
    private int fuelLevel;

    public Motorcycle(String id, String brand, int wheelCount, int topSpeed, boolean hasSidecar, int engineCC) {
        super(id, brand, wheelCount, topSpeed);
        this.hasSidecar = hasSidecar;
        this.engineCC = engineCC;
        this.fuelLevel = 0;
    }

    public boolean isHasSidecar() { return hasSidecar; }
    public void setHasSidecar(boolean hasSidecar) { this.hasSidecar = hasSidecar; }
    public int getEngineCC() { return engineCC; }
    public void setEngineCC(int engineCC) { this.engineCC = engineCC; }

    @Override
    public void refuel(int amount) { fuelLevel += amount; }
    @Override
    public int getFuelLevel() { return fuelLevel; }
    @Override
    public boolean isTankEmpty() { return fuelLevel <= 0; }

    @Override
    public String startEngine() { return getMake() + " motorcycle engine started."; }
    @Override
    public String stopEngine() { return getMake() + " motorcycle engine stopped."; }
    @Override
    public void accelerate(int amount) { }

    @Override
    public String inspect() { return "Inspecting " + getMake() + " motorcycle."; }
    @Override
    public String repair() { return getMake() + " motorcycle repaired."; }
    @Override
    public boolean needsService() { return engineCC <= 0; }

    @Override
    public String vehicleType() { return "Motorcycle"; }

    @Override
    public String describe() {
        return "Motorcycle " + getMake() + " | " + engineCC + "cc | fuel:" + fuelLevel;
    }
}