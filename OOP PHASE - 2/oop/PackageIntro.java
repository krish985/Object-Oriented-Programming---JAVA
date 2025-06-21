package oop;    // Currently in oop package.
import java.util.Scanner;  // Inbuilt package importing.

public class PackageIntro {
    public static void main(String[] args) {
        // 📦 What is a Package in Java?
        // A package in namespace that organize classes and intefaces in a
        // logical manner image a computer folder all folder are grouped
        // together in systemetic way.

        //🔹 Why Use Packages?
        // -> it Easiser to manage large codebase.
        // -> Write a Same class name on diffrent package.
        // -> Easier to maintain code.
        // -> and important you can resuse the package via importing.

        // 🔹 Inbuilt Package.
        //  -> like importing package like Math ArrayList sqrt etc...
        // Example :
        System.out.println("What's your Name");
        Scanner scn = new Scanner(System.in);
        String something = scn.nextLine();
        scn.close();
    
        // 🔹 User Defined package.
        // You can use package without impoerting because 
        // fill in the same package.
        // -> that greeting function wriiten on testpackage class.
        TestPackage.greeting(something);
        

    }
}
