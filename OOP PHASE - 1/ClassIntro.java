public class ClassIntro {
    // Create an Class.
    // Q create something that store marks name age of studnet.
    // Define your own custom data type.
    class student {      // class name student.
        float marks;    // Store marks.
        int age;       // store age.
        String name;  // store name.

        // define method that greet.
        public static void greet() {
            System.out.println("Good Mornning");
        }
    }

    public static void main(String[] args) {
        // Class are basically blueprint and you can say mold of
        // An object.

        // Supoose i can give you problem statement store marks of 5 student.
        // you Simply create float of array and store like this.
        float marks[] = { 56, 30, 100, 50, 87 };

        // Same as name store 5 student name simply do create string of array.
        String names[] = { "Alex", "tina", "Rahul", "Gaurav", "Manav" };

        // Now store age for 5 student simply create an integer of array and store.
        int age[] = { 17, 16, 18, 17, 20 };

        // ❓ Now the actual problem statement store student name along with their number
        // and age ?.
        // Now what you can do think thier is no way to store all of this thing into
        // single unit.
        // here's the class come into the picture.

        // you can store all data into single unit.
        // Not only data you can store methods it means function.
        // suppose you write a function that greet .
        // you can say class is a custom data type where devloper can create along with
        // their requirement.

        // See line Number 2.

    }
}