package games;

public class Potion extends Item {

    private int healAmount;
    private String potionType;

    public Potion(String itemName, int value, int healAmount, String potionType) {
        super(itemName, value);
        this.healAmount = healAmount;
        this.potionType = potionType;
    }

    public int getHealAmount() { return healAmount; }
    public void setHealAmount(int healAmount) { this.healAmount = healAmount; }

    public String getPotionType() { return potionType; }
    public void setPotionType(String potionType) { this.potionType = potionType; }

    @Override
    public String use(GameCharacter target) {
        target.heal(healAmount);
        return getItemName() + " heals " + target.getName() + " for " + healAmount + " HP.";
    }
}
