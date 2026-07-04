package vehicles;

public class Battery extends Part implements Installable {
    private int voltage;
    private int capacityAh;

    public Battery(String partName, String partNumber, int voltage, int capacityAh) {
        super(partName, partNumber);
        this.voltage = voltage;
        this.capacityAh = capacityAh;
    }

    public int getVoltage() { return voltage; }
    public void setVoltage(int voltage) { this.voltage = voltage; }
    public int getCapacityAh() { return capacityAh; }
    public void setCapacityAh(int capacityAh) { this.capacityAh = capacityAh; }

    @Override
    public String install() { return getPartName() + " connected."; }
    @Override
    public String remove() { return getPartName() + " disconnected."; }
    @Override
    public boolean isCompatibleWith(String vehicleType) { return true; }

    @Override
    public String function() { return "Stores and supplies electrical charge."; }
}