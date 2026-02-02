// A subclass of Animal that has a Sound (has-a relationship)
package is_a_has_a;

public class Cat extends Animal{
    private boolean hasTail;
    private Sound sound;

    public Cat(String name, int eyes, int legs, boolean hasTail, Sound sound) {
        super(name, eyes, legs);
        this.hasTail = hasTail;
        this.sound = sound;
    }

    public String toString() {
        return "Cat[" + super.toString() + ", has tail=" + hasTail + "] " + sound.toString() + "]";
    }
}
