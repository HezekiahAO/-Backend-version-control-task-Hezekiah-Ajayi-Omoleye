package games;

// Root of the hierarchy. Anything "in" the game (character or otherwise)
// has an id and a name. Subclasses must define what "describe" means for them.
public abstract class GameEntity {

    private String id;
    private String name;

    public GameEntity(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public abstract String describe();
}
