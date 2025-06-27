package Inheritance;

public class SingleInheritance {
    // Parent class
    static class Animal {
        String name;
        String color;

        // Call constructor to initializing object.
        Animal(String name) {
            this.name = name;
        }

        String getName() {
            return name;
        }
    }

    // Child class inheriting properties of parent class.
    // Syntax static class classname extends parent class name.
    static class Dog extends Animal {
        // Call dog constructor.
        Dog(String name,String color) {
            // Its called parent class constructor just imediate one.
            super(name);
            // and you can access member of parent class and set val.
            super.color = color;
        }

        // Dog have their own functionality.
        void bark() {
            System.out.println("Woof...");
        }
    }

    public static void main(String[] args) {
        // ✅ What is Inheritance?
        // Inheritance is a 4 pillar of an oop.
        // -> that's allow you to interhit one class properties to another class.
        // -> properties means method or data member feilds etc.
        // -> and the main class called (parent class , base class).

        // Example -> Like child inherit properties of their parents.

        // 🔹 Why Use Inheritance?
        // Code reusability – write once, use many times.
        // Maintainability – easier to update or extend.
        // Extensibility – build more complex behaviors by extending base functionality.

        // Here is how implementing inheritance.
        // -> See line no : 4.
        // Create an object of dog class but it will access parent class properties.
        Dog rimp = new Dog("Rimp","Brown");

        System.out.println(rimp.name);  // name are avilaible in animal class.
        System.out.println(rimp.color);
        rimp.bark();

        // ✅ Types of inheritance.
        // -> Single Inheritance.
        // -> Multilevel Inheritance.
        // -> Multiple Inheritance. (can not directly implement in java) See in iterface part.
        // -> Hubrid Interitance.   (can not directly implement in java) See in interface part
        // -> Hierarchial Inheritance.

        // ✅ Sigle Inheritance.
        // Now question what is single inheritance.
        // -> In Single inheritance their is one parent class and one child class.
        // -> child class inherit the proprties of parent class.
        // As simple as that we see the example of sigle inheritance in
        // -> line no 4 : where Animal is parent class and refering that parent class.
        // -> create Dog child class.

    }
}
