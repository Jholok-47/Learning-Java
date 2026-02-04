package Abstract;

public abstract class Vehicle {
    private int wheels;
    private boolean hasEngine;

    public Vehicle(int wheels, boolean hasEngine) {
        this.wheels = wheels;
        this.hasEngine = hasEngine;
    }

    public String toString() {
        return "Wheels: " + wheels + ", Has engine? - " + hasEngine;
    }

    public abstract void move();
}
