public class ConstructorOrThisKeyWord {
    static class Student { // class name student.
        float marks; // Store marks.
        int age; // store age.
        String name; // store name.

        // ✅ this keyword.
        // Basically is refrence variable refer to an curr context of an object.
        // when the local (variable and method have same name) of instance variable this
        // keword solve conflicts.
        Student(String name, int age, float marks) { // Parametrized constructor.
            this.name = name;
            this.age = age;
            this.marks = marks;
            // The constructor parameters have the same names as class variables.
            // So, 'this' is used to refer to the class-level (instance) variables.

        }

        // Default Constructor : that does not accept any parameter.
        // note : if you define constructor java not initialize default constructor.
        Student() {
            // if you only create object withod passing anything that constructor call.
            // and set this default value.
            this.marks = 100f;
            this.age = 25;
            this.name = "Sample";
        }

        // Copy Constructor : Copy data from object to another object.
        // it accept object.
        Student(Student s) {
            this.name = s.name;
            this.age = s.age;
            this.marks = s.marks;
        }
    }

    public static void main(String[] args) {
        // ✅ What is a Constructor.
        // A constructor in a special method is used to initialize object when it
        // created.
        // -> constructor have same name of class.
        // -> constructor have no return type not even void.

        // ✅ Three types of constructor.
        // -> default constructor.
        // -> parametriesed constructor.
        // -> copy constructor.

        // yet the time you intialize value of an object using . operator.
        // but what if you have to create 100 diffrent object you could not write
        // name . something age . something again an again.

        // so whenever yoy create an object simply pass the value of an constructor
        // like this.
        Student alex = new Student("Alex", 22, 89.34f);
        Student john = new Student("john", 21, 95.86f);

        // COPY Constructor.
        Student david = new Student("David", 23, 90.0f);
        Student mike = new Student(david);

        // And now simply you accese their value.
        System.out.println(alex.name);
        System.out.println(john.name);
        System.out.println(david.name);
        System.out.println(mike.name);

        // -> see line no 6.
    }
}
