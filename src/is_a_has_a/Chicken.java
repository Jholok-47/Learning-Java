// A subclass of Animal that has a Sound (has-a relationship)
package is_a_has_a;

public class Chicken extends Animal{
    private boolean canFly;
    private Sound sound;

    public Chicken(String name, int eyes, int legs, boolean canFly, Sound sound) {
        super(name, eyes, legs);
        this.canFly = canFly;
        this.sound = sound;
    }

    public String toString() {
        return "Chicken[" + super.toString() + ", can fly=" + canFly + "] " + sound.toString() + "]";
    }
}