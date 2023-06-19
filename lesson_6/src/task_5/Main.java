package task_5;

import task_5.Engines.DieselEngine;
import task_5.Engines.PetrolEngine;
import task_5.Vehicles.Car;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(new DieselEngine());
        Car car2 = new Car(new PetrolEngine());
    }
}
