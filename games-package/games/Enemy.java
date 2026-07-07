package games;

// Enemy IS a GameCharacter too, but deliberately does NOT implement
// Scorable/Leveling/Inventoriable - it has no use for them.
public class Enemy extends GameCharacter {

    private int damage;
    private String enemyType;

    public Enemy(String id, String name, int maxHealth, int damage, String enemyType) {
        super(id, name, maxHealth);
        this.damage = damage;
        this.enemyType = enemyType;
    }

    public int getDamage() { return damage; }
    public void setDamage(int damage) { this.damage = damage; }

    public String getEnemyType() { return enemyType; }
    public void setEnemyType(String enemyType) { this.enemyType = enemyType; }

    public String attack(GameCharacter target) {
        target.takeDamage(damage);
        return getName() + " attacks " + target.getName() + " for " + damage + " damage.";
    }

    @Override
    public String makeMove() {
        return getName() + " (" + enemyType + ") lurches forward.";
    }

    @Override
    public String describe() {
        return "Enemy " + getName() + " [" + enemyType + "]"
                + " | HP:" + getHealth() + "/" + getMaxHealth()
                + " | DMG:" + damage;
    }
}
