import java.util.ArrayList;
import java.util.List;

public class WrapperClass {
    // Pragram that swap two numbers.
    public static void swap(Integer a, Integer b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        // 🔹 What is wrapper class.
        // wrapper class basicaly conversion of primitive type into object.
        // like -> int , char , float , short , byte , long , boolean , Double
        // All of this have wrapper class.
        // Example.
        Integer val = 10; // it create integer object.
        val = 20;
        System.out.println(val);

        // Wrapper class is immutable .
        // -> after initializion happen you could not modify their value.

        // Suppose create a program that swaping a val.
        Integer a = 10;
        Integer b = 20;
        swap(a, b);
        System.out.println("A : " + a + " B : " + b); // cannot change their value.

        // KEY DIFFRENCE :
        // primitive type -> stored in stack memory . default value : 0 for int boolean for false.
        // Wrapper class -> stored in heap memory (as object). default val : null.

        // 🔹 Autoboxing .
        // convert primitive type to coressponding wrapper class.
        int val1 = 50;
        Integer val2 = val1; // Convert int -> Integer.

        // 🔹 Unboxing .
        // convert wrapper class to their corresponding primitive type.
        Integer val3 = 80;
        int val4 = val3; // Convert Integer -> int.
        System.out.println(val2+val4);

        //🔹 Real-World Example: With Collections.
        List<Integer> list = new ArrayList<>();

        list.add(10);     // Autoboxing :  int -> Integer.
        int x = list.get(0);  // Unboxing :  Integer -> int.
        System.out.println("Value of : " + x);

    }

}
