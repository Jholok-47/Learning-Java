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

    public static void main(String args[]) {
        Vehicle bus = new Bus(4, true, "Moderately fast.");

        bus.move();

        System.out.println(bus);
    }
}
