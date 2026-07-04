package vehicles;

public abstract class Part {
    private String partName;
    private String partNumber;

    public Part(String partName, String partNumber) {
        this.partName = partName;
        this.partNumber = partNumber;
    }

    public String getPartName() { return partName; }
    public void setPartName(String partName) { this.partName = partName; }
    public String getPartNumber() { return partNumber; }
    public void setPartNumber(String partNumber) { this.partNumber = partNumber; }

    public abstract String function();
}