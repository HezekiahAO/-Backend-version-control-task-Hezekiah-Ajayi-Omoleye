package vehicles;

public interface Installable {
    
    String install();
    String remove();
    boolean isCompatibleWith(String vehicleType);
}