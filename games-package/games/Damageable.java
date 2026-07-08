package games;

public interface Damageable {
    void takeDamage(int amount);
    void heal(int amount);
    boolean isAlive();
}
