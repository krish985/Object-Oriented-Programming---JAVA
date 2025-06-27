package Polymorphism;

public class CompileTimePolymorphism {
    static class Calculator {
        // All the function have same name but diffrent paramenter
        public int add(int a, int b) {
            return a + b;
        }

        public int add(int a, int b, int c) {
            return a + b + c;
        }

        public int add(int a, int b, int c, int d) {
            return a + b + c + d;
        }
    }

    public static void main(String[] args) {
        // 🔷 Run Time polymorphism.
        // -> Achived via Method Overloading
        // -> In this you can define inside a class multile function
        // -> with same name but diffrent paramenter that's known
        // -> function Overloading.

        // Example : Craate a calculator class.
        // -> that's add number.

        // Craete Object of It.
        Calculator cal = new Calculator();
        System.out.println(cal.add(5, 10)); // 15.
        System.out.println(cal.add(5, 10, 15)); // 30.
        System.out.println(cal.add(2, 4, 6, 8)); // 20.

        // Conslusion : All though you call same name of func but if you pass 2 number
        // -> it will call that func that accepet two arrgument same as 3 number or 4
        // number.
        // -> that's why we are calling many ways to reprsent something.

    }
}
