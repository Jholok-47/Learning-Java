package Abstract;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        Rickshaw rickshaw = new Rickshaw(3, false, "Not very fast.");
        Bus bus = new Bus(4, true, "Moderately fast.");
        Ship ship = new Ship(0, true, "Moderately fast.");
        Chopper chopper = new Chopper(0, true, "Pretty fast.");
        Vehicle car = new Car(4, true, "Fast as F boiiiii.");

        List<Vehicle> list = List.of(rickshaw, bus, ship, chopper, car);
        for(int i = 0; i < list.size(); i++){
            list.get(i).move();
        }
    }
}
