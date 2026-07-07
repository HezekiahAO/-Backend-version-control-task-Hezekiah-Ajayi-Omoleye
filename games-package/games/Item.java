package games;

// Blueprint for anything a Player can carry. Weapons and Potions both
// "use" themselves differently on a target, so use() is abstract.
public abstract class Item {

    private String itemName;
    private int value;

    public Item(String itemName, int value) {
        this.itemName = itemName;
        this.value = value;
    }

    public String getItemName() { return itemName; }
    public void setItemName(String itemName) { this.itemName = itemName; }

    public int getValue() { return value; }
    public void setValue(int value) { this.value = value; }

    public abstract String use(GameCharacter target);
}
