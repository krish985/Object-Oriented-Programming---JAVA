package AbstractClass;

public class Main {
    public static void main(String[] args) {
        // 🔸 4. Abstract Class .
        // -> if you decleare any class using abstract keyword.
        // -> you can not  create instance of it means object and
        // -> it allow you write.
        // Abstract method (withod body).
        // concreate method (with body).

        // 🚗 Real-Life Example: Vehicle
        // We will create:
        // An abstract class Vehicle : See Vechicle.java file.
        // Subclasses: Car, Bike : see Bike.jav file.
        // Use Main() to demonstrate abstraction

        // Create object of car and bike.
        Vechicle car = new Car();
        car.start();
        car.fuelType();

        System.out.println("-------");

        Vechicle bike = new Bike();
        bike.start();
        bike.fuelType();

        // 📦 When to Use:
        // -> When you want to provide base functionality to multiple classes
        // -> When you want to enforce some methods to be implemented
        // -> When the classes are closely related and share common behavior

        // ✅ Use abstract class when you want some default implementation.
        // ✅ Use interface when you want only method signatures and full abstraction.
    }
}
