package Inheritance;

public class HierarchialInheritance {
    // Parent class.
    static class Employee {
        String name;
        int salary;
        int id;

        // Call Employee class constructor.
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

    // Derived class 1 inherit employee.
    static class Devloper extends Employee {
        // Devloper work on their tech stack.
        String techStack;

        // Call Devloper Constructor.
        Devloper(String name, int salary, int id, String techStack) {
            super(name, salary, id); // Call employee constructor.
            this.techStack = techStack;
        }

        // method fetch devloper detail.
        void getDevloperDetails() {
            getDetails(); // Call Employee method to fetch detail.
            System.out.println("TechStack : " + techStack);
        }
    }

    // Derived class 2 inherit employee.
    static class Designer extends Employee {
        // Designer work on some tool.
        String tool;

        // Call Devloper Constructor.
        Designer(String name, int salary, int id, String tool) {
            super(name, salary, id); // Call employee constructor.
            this.tool = tool;
        }

        // method fetch designer detail.
        void getDesignerDetails() {
            getDetails(); // Call Employee method to fetch detail.
            System.out.println("Tool : " + tool);
        }
    }

    public static void main(String[] args) {
        // ✅ Hierarchical Inheritance in Java.
        // is a simple inheritance multiple childs are
        // inherits same parent class.

        // One Way to Understand Refactor previous example.
        // Scenerio.
        // -> there is Employee (parent class).
        // -> Designer class that inherit -> Employee.
        // -> Devloper class that also inherit -> Employee.

        // Conclusion : One parent class have multiple child class.

        // See Line No 4.
        // -> Create a object of devloper and designer but they use common class
        // -> Employee to set their name salary id.

        Designer ruquaiya = new Designer("Ruquaiya", 70000, 101, "Figma");
        Devloper mike = new Devloper("Mike", 200000, 07, "Java Full Stack");

        // fetch details.
        ruquaiya.getDesignerDetails();
        mike.getDevloperDetails();
    }
}
