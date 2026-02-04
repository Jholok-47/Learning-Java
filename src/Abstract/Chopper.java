package Abstract;

public class Chopper extends Vehicle{
    String speed;
    public Chopper(int wheels, boolean hasEngine, String speed) {
        super(wheels, hasEngine);
        this.speed = speed;
    }

    @Override
    public void move() {
        System.out.println("Ship goes whop-whop-whop.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Speed: " + speed;
    }
}
