// This program demonstrates the "is-a" and "has-a" relationships using classes for animals and their sounds.
package is_a_has_a;

public class Main {
    public static void main(String[] args) {
        Sound meowSound = new Sound("Meow", 5, "Medium");
        Cat cat = new Cat("Whiskers", 2, 4, true, meowSound);
        System.out.println(cat.toString());

        Sound cluckSound = new Sound("Cluck", 3, "High");
        Chicken chicken = new Chicken("Chirpy", 2, 2, false, cluckSound);
        System.out.println(chicken.toString());
    }
}
