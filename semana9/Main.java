import Models.Car;
import Models.Motocycle;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("287921", "Tesla");
        car1.turnOn();

        Motocycle motocycle1 = new Motocycle("2341", "Tucson");
        motocycle1.turnOn();
    }
}