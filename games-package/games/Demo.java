package games;

public class Demo {
    public static void main(String[] args) {
        Player hero = new Player("P1", "Aria", 100);
        Enemy goblin = new Enemy("E1", "Goblin", 40, 12, "Goblin");
        Weapon sword = new Weapon("Iron Sword", 50, 15, 5);
        Potion potion = new Potion("Healing Potion", 20, 25, "Health");

        hero.addItem(sword);
        hero.addItem(potion);

        GameSession session = new GameSession("S1", hero);

        System.out.println(session.startGame());
        System.out.println(hero.describe());
        System.out.println(goblin.describe());
        System.out.println();

        System.out.println(hero.makeMove());
        System.out.println(sword.use(goblin));
        System.out.println(goblin.attack(hero));
        System.out.println(potion.use(hero));
        System.out.println();

        hero.addScore(150);
        hero.levelUp();

        System.out.println(hero.describe());
        System.out.println(goblin.describe());
        System.out.println("Hero carrying " + hero.listItems().size() + " item(s)");
        System.out.println();

        System.out.println(session.endGame());
    }
}
