package games;

// Any living thing in the game. Extends GameEntity (it IS an entity) and
// implements Damageable (it CAN take damage) - the health logic lives here
// once, instead of being copy-pasted into Player and Enemy separately.
public abstract class GameCharacter extends GameEntity implements Damageable {

    private int health;
    private int maxHealth;

    public GameCharacter(String id, String name, int maxHealth) {
        super(id, name);
        this.maxHealth = maxHealth;
        this.health = maxHealth;
    }

    public int getHealth() { return health; }
    public void setHealth(int health) { this.health = health; }

    public int getMaxHealth() { return maxHealth; }
    public void setMaxHealth(int maxHealth) { this.maxHealth = maxHealth; }

    @Override
    public void takeDamage(int amount) {
        health = Math.max(0, health - amount);
    }

    @Override
    public void heal(int amount) {
        health = Math.min(maxHealth, health + amount);
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    // Every character moves differently - forces subclasses to define it.
    public abstract String makeMove();
}
