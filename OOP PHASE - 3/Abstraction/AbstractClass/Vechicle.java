package AbstractClass;

// Using abstract keyword make class abstract
public abstract class Vechicle {
    // Without Body with abstract.
    abstract void start();

    // Concreate with Body.
    void fuelType(){
        System.out.println("Use Some Kind Of Fuel to start");
    }
}
