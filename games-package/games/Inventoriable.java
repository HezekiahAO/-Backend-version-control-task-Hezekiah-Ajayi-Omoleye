package games;

import java.util.List;

public interface Inventoriable {
    void addItem(Item item);
    void removeItem(Item item);
    List<Item> listItems();
}
