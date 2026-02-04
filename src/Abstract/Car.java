package Abstract;

public class Car extends Vehicle{
    String speed;
    public Car(int wheels, boolean hasEngine, String speed) {
        super(wheels, hasEngine);
        this.speed = speed;
    }

    @Override
    public void move() {
        System.out.println("Car goes shoo shoo.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Speed: " + speed;
    }
}
