package Abstract;

public class Ship extends Vehicle{
    String speed;
    public Ship(int wheels, boolean hasEngine, String speed) {
        super(wheels, hasEngine);
        this.speed = speed;
    }

    @Override
    public void move() {
        System.out.println("Ship goes HOOONK HOOOOOONK");
    }

    @Override
    public String toString() {
        return super.toString() + ", Speed: " + speed;
    }
}
