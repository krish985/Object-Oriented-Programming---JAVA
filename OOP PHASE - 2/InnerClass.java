public class InnerClass {
    // Inner non static class
    class inner1 {
        void display() {
            System.out.println("hello");
        }
    }

    // Inner static class.
    static class Inner2 {
        void display() {
            System.out.println("Hello coder");
        }
    }

    // Local inner class inside method.
    void outerMethod(){
        class LocalInner{
            void msg(){
                System.out.println("Inner class inside method calling");
            }
        }

        // create object of local inner.
        LocalInner obj = new LocalInner();
        obj.msg();
    }

   
    public static void main(String[] args) {
        // 🧠 What is an Inner Class?
        // -> A class inside another class that's call inner class.
        // Example : A school have classroom inside it.

        // 🤔 Why use Inner Class?
        // To group related logic together.
        // To use outer class variables easily.

        // ✅ Normal (Non-static) Inner Class : line no : 2.
        InnerClass obj = new InnerClass(); // Firstly create outer object.
        InnerClass.inner1 actualobj = obj.new inner1(); // create inner object.
        actualobj.display(); // Now use acctual obj.

        // ✅ Static Inner Class : line no : 9.
        // -> you don't need to create outer object.
        // -> direct create an object of the class.
        Inner2 obj2 = new Inner2();
        obj2.display();

        //✅  Local Inner Class (inside method) : line no 16.
        obj.outerMethod();  // refer to class then accese method.

    }
}
