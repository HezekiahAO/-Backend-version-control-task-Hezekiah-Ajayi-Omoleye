package vehicles;

public class Demo {
    public static void main(String[] args) {
       Car c = new Car("Toyota", "Corolla", 4, 180, 4);
       c.refuel(30);
        System.out.println(c.describe());
        System.out.println(c.startEngine());
    }
}