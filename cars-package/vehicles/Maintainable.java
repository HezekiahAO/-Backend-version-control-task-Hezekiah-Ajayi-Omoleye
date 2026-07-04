package vehicles;

public interface Maintainable {
    String inspect();
    String repair();
    boolean needsService();
}