package Abstract;

public class Rickshaw extends Vehicle{
    public Rickshaw(int wheels, boolean hasEngine) {
        super(wheels, hasEngine);
    }

    @Override
    public void move() {
        System.out.println("Rickshaw goes ring ring");
    }

    public static void main(String args[]) {
        Vehicle rickshaw = new Rickshaw(4, false);

        rickshaw.move();
    }
}
