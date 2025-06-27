package AbstractClass;

// Extends that vechicle class
public class Car extends Vechicle {

    @Override
    void start() {  // Override that method.
        System.out.println("Car Start...");
    }

    @Override
    void fuelType(){   // Also override full body method.
        System.out.println("Car Uses petrol");
    }
}
