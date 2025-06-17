public class finalKeyword {
    // final keyword with class.
    // you can not inherit that class to another class.
    final class Student{
        int a;
    }

    // Also use final keyword with function paramater.
    final public static void sum(final int a , final int b){
        // you can not do this.
        // a = 1;
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        // 🔸 1. what is final keyword.
        // final keyword is used to make things constant.
        // use final keyord with variable , methods , class.

        // Example : final keyword whith varaible.
        final int val = 10;
        // val = 10;  you can not modify after initialize value.

        System.out.println(val);
        sum(5, 6);

        //🧹 Purpose of Garbage Collector (GC) in Java.
        // in java Gc is memory management system. it primary purpose to free space.
        // using deleting object.
        // -> without Gc you have to manually free the space like (C,C++).
        // -> SomeTime you forget to free object so it take to much memory extra 
        // and also cause for memory leak that why use Gc.
    
    }
}
