package Inheritance;

public class MultiLevelInheritance {
    // Example of Multilevel inheritance.
    // Parent class.
    static class Employee {
        String name;
        int salary;
        int id;

        // Constructor for set val.
        Employee(String name, int salary, int id) {
            this.name = name;
            this.salary = salary;
            this.id = id;
        }

        // Function that give employee details.
        void getDetails() {
            System.out.println("Employee Name is : " + name);
            System.out.println("Employee Salary is : " + salary);
            System.out.println("Employee Id is : " + id);
        }
    }

    // Derived class that inherit -> Employee class.
    static class Devloper extends Employee {
        // So devloper work some programming laungauage.
        String programmingLanguage;

        // Devloper constructor.
        Devloper(String name, int salary, int id, String launguage) {
            super(name, salary, id); // Call employee constructor.
            this.programmingLanguage = launguage;
        }

        // Function that show devloper details.
        void showDevloperDetails() {
            getDetails(); // Call parent class method to fetch detail.
            System.out.println("Launguage : " + programmingLanguage);
        }
    }

    // Further derived class inherit -> Devloper.
    static class FrontendDevloper extends Devloper {
        // Frontend devloper work some framework.
        String frameWork;

        // Frontend devloper constructor.
        FrontendDevloper(String name, int salary, int id, String launguage, String frameWork) {
            super(name, salary, id, launguage); // call devloper contructor.
            this.frameWork = frameWork;
        }

        // Function that Show frontend devloper detail.
        void getFrontendDevloperDetails() {
            showDevloperDetails();
            System.out.println("FrameWork : " + frameWork);
        }
    }

    public static void main(String[] args) {
        // ✅ Multilevel Inheritance.
        // -> in multilevel inheritance.
        // there a parent class (base class) , a child class (derived from the parent)
        // and a grand child (derived from a child).

        // Example parent -> child -> Grand child.

        // Scenerio :
        // -> their is Employee class (name , salaray , id).
        // -> Create Devloper that inherits -> Employee.
        // -> Create frontend Devloper that inherit -> Devloper.

        // See line no 4.
        // Create a object of frontend devloper.
        FrontendDevloper john = new FrontendDevloper("John", 90000, 10, "Javascript", "React");
        FrontendDevloper emily = new FrontendDevloper("Emily", 85000, 28, "TypeScript", "Angular");

        // Call meyhod get front end dev detail.
        john.getFrontendDevloperDetails();
        System.out.println("------------------");
        emily.getFrontendDevloperDetails();

        // that's the example of multilevel inheritance.

        // ✅ What is Constructor Chaining in Java?
        // it means calling one constructor to another constructor
        // using super keyword.

        // like in that example set value like this.
        // -> Call fronendDevloper constructor.
        // -> that call Devloper constructor.
        // -> Devloper Calls Employee Constructor.

    }
}
