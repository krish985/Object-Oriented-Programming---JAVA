package Polymorphism;

public class RunTimePolymorphism {
    // Payment parent class.
    static class Payment {
        void pay() {
            System.out.println("Initially payment");
        }
    }

    // Upi class inherits -> Payment
    static class Upi extends Payment {
        @Override
        void pay() {
            System.out.println("Payment Done via UPI");
        }
    }

    // DebitCard class inherits -> Payment
    static class DebitCard extends Payment {
        @Override
        void pay() {
            System.out.println("Payment Done via DebitCard");
        }
    }

    public static void main(String[] args) {
        // 🔷 Run-Time Polymorphism in Java (Dynamic Method Dispatch).
        // -> Achived via Method Overrideing.
        // -> Run-Time Polymorphism means the method to be executed is decided at
        // -> runtime not at compile time.

        // -> This is achieved through method overriding and upcasting (parent class
        // -> reference pointing to child class object).

        // ✅ Real-Life Example: Payment System.
        // -> Create Payment parent class that have ablity to pay().
        // -> and create Upi or Debit card payment class that inherits -> Payment class.
        // -> and that upi or devid card class override the pay() method of payment
        // class.

        // Create object where the refrence type of parent but call child class.
        // also this call Upcasting

        Payment paying1 = new Upi();
        Payment payment2 = new DebitCard();

        // It will decide on run time which method to call.
        paying1.pay();
        payment2.pay();

        // Note* If you createing object and using refrence of parent class
        // make sure that same function available on parent class.
    }
}
