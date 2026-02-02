// A parent class representing an Animal
package is_a_has_a;

public class Animal {
    private String name;
    private int eyes;
    private int legs;

    public Animal(String name, int eyes, int legs) {
        this.name = name;
        this.eyes = eyes;
        this.legs = legs;
    }

    public String toString () {
        return "Animal[name=" + name + ", eyes=" + eyes + ", legs=" + legs;
    }
}
