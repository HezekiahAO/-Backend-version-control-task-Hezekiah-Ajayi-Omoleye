package games;

import java.util.ArrayList;
import java.util.List;

// Player IS a GameCharacter (inheritance) but only Player CAN score,
// level up, and carry items (interfaces). Enemy will NOT get these.
public class Player extends GameCharacter implements Scorable, Leveling, Inventoriable {

    private static final int MAX_LEVEL = 50;

    private int score;
    private int level;
    private List<Item> items;

    public Player(String id, String name, int maxHealth) {
        super(id, name, maxHealth);
        this.score = 0;
        this.level = 1;
        this.items = new ArrayList<>();
    }

    public int getScore() { return score; }
    public void setScore(int score) { this.score = score; }

    public int getLevel() { return level; }
    public void setLevel(int level) { this.level = level; }

    @Override
    public void addScore(int points) {
        if (points > 0) score += points;
    }

    @Override
    public void resetScore() { score = 0; }

    @Override
    public void levelUp() {
        if (!isMaxLevel()) level++;
    }

    @Override
    public boolean isMaxLevel() { return level >= MAX_LEVEL; }

    @Override
    public void addItem(Item item) { items.add(item); }

    @Override
    public void removeItem(Item item) { items.remove(item); }

    @Override
    public List<Item> listItems() { return items; }

    @Override
    public String makeMove() {
        return getName() + " advances cautiously through the level.";
    }

    @Override
    public String describe() {
        return "Player " + getName() + " | Lv." + level
                + " | HP:" + getHealth() + "/" + getMaxHealth()
                + " | Score:" + score;
    }
}
