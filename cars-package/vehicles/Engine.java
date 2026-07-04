package vehicles;

public class Engine extends Part implements Installable {
    private int horsepower;
    private String fuelType;

    public Engine(String partName, String partNumber, int horsepower, String fuelType) {
        super(partName, partNumber);
        this.horsepower = horsepower;
        this.fuelType = fuelType;
    }

    public int getHorsepower() { return horsepower; }
    public void setHorsepower(int horsepower) { this.horsepower = horsepower; }
    public String getFuelType() { return fuelType; }
    public void setFuelType(String fuelType) { this.fuelType = fuelType; }

    @Override
    public String install() { return getPartName() + " installed."; }
    @Override
    public String remove() { return getPartName() + " removed."; }
    @Override
    public boolean isCompatibleWith(String vehicleType) { return true; }

    @Override
    public String function() { return "Converts fuel into motion."; }
}