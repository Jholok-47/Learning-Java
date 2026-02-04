package Abstract;

public class Bus extends Vehicle{
    String speed;
    public Bus(int wheels, boolean hasEngine, String speed) {
        super(wheels, hasEngine);
        this.speed = speed;
    }

    @Override
    public void move() {
        System.out.println("Bus goes vroom vroom.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Speed: " + speed;
    }
}
