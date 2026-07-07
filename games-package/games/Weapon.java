package games;

public class Weapon extends Item {

    private int damage;
    private int durability;

    public Weapon(String itemName, int value, int damage, int durability) {
        super(itemName, value);
        this.damage = damage;
        this.durability = durability;
    }

    public int getDamage() { return damage; }
    public void setDamage(int damage) { this.damage = damage; }

    public int getDurability() { return durability; }
    public void setDurability(int durability) { this.durability = durability; }

    @Override
    public String use(GameCharacter target) {
        if (durability <= 0) {
            return getItemName() + " is broken and cannot be used.";
        }
        target.takeDamage(damage);
        durability--;
        return getItemName() + " strikes " + target.getName() + " for " + damage
                + " damage. (" + durability + " durability left)";
    }
}
