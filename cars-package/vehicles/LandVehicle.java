package vehicles;

public abstract class LandVehicle extends Vehicles {
    private int wheelCount;
    private int topSpeed;

    public LandVehicle(String id, String brand, int wheelCount, int topSpeed) {
        super(id, brand);
        this.wheelCount = wheelCount;
        this.topSpeed = topSpeed;
    }

    public int getWheelCount() { return wheelCount; }
    public void setWheelCount(int wheelCount) { this.wheelCount = wheelCount; }
    public int getTopSpeed() { return topSpeed; }
    public void setTopSpeed(int topSpeed) { this.topSpeed = topSpeed; }

    public abstract String vehicleType();
}