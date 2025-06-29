import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class IntroComparable {
    // Implement comparable interface and pass generic what you
    // want to compare so passing Student class name itself.
    public static class Student implements Comparable<Student> {
        String name;
        int marks;

        Student(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }

        // Override compare to function that compares obj.
        @Override
        public int compareTo(Student obj) {
            return obj.marks - this.marks; // Sort decending order.
        }
        // -> If result < 0: this comes before other
        // -> If result == 0: they are equal (no swap)
        // -> If result > 0: this comes after other

    }

    public static void main(String[] args) {
        // 🔰 1. What is Comparable.
        // Comparable is an interface of java.lang package
        // it is Commonly used for sorting object like student employe etc.

        // Sorting : is way to arrange value either in ascending or decending order.
        // -> like if you want to sort an array what you will do.
        int arr[] = { 1, 5, 2, 4, 0 };
        Arrays.sort(arr); // It will sort the array in ascending order.

        // -> Give you the problem statement sort student object bases on their marks.
        // Create object of it.

        // 🔹 Scenerio
        // -> create a list that store Student object.
        // -> and add some student name or marks.
        // -> then iterate and print it will print in sorted manner.
        // -> due to comparable compare to method sort that val.
        ArrayList<Student> collegeStudents = new ArrayList<>();
        collegeStudents.add(new Student("kunal", 50));
        collegeStudents.add(new Student("john", 40));
        collegeStudents.add(new Student("alex", 30));
        collegeStudents.add(new Student("sachin", 70));

        // 🧠 What is compareTo() see line no 18.
        // -> The compareTo() method tells Java how two objects should be ordered when
        // sorting.
        // -> Java's Collections.sort() (or Arrays.sort()) uses your compareTo() to
        // compare pairs
        // -> of elements, then swaps them if needed — like bubble sort or quicksort
        // under the hood.

        // Collections.sort() : it will sort base on what exactly you write in compare
        // to func.
        Collections.sort(collegeStudents);

        for (Student stu : collegeStudents) {
            System.out.println(stu.name + " : " + stu.marks);
        }

    }
}