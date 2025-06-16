public class Object {
    static class Student { // class name student.
        float marks; // Store marks.
        int age; // store age.
        String name; // store name.

        // define method that greet.
        public static void greet() {
            System.out.println("Good Mornning");
        }
    }

    public static void main(String[] args) {
        // 🔹 1. What is object
        // object are basically acctual implemntation of class you can also
        // say the acctual existence of the class.
        // Also say instance of an class.

        // and now i give you problem statement to store student name age along with
        // their name
        // after creating a class we have create the object of the class.
        // refer to the class name.

        // Object creation syntax.
        // class_name refrence variable name = new keyword then classname custructor()
        Student obj1 = new Student();

        // 🔹 2. Memory Allocation and Behavior
        // -> when we create object using new keyword.
        // -> what happens in memory.
        // -> Memory Allocated in heap.
        // -> Refrence variable store in a stack.

        // student : this is the name of class you createing object of it.
        // obj1 : also called a refrence variable of that individual student.
        // New keyword : basically it used to create new object from heap memeory.
        // student() : constructor of the class used to initiallize object.

        // Now you have to store value using . operator.

        // NOTE* : if you not initialize value it will initially store their default value.
        // Default values are assigned to the fields (int → 0, String → null).
        System.out.println(obj1.name);
        obj1.name = "Tony Stark";
        obj1.age = 25;
        obj1.marks = 89;

        // Now you can print their name.
        
        //🔹 3. Accesing member of an object
        // Use . (dot) operator.
        System.out.println(obj1.name); // "Tony Stark".

    }
}