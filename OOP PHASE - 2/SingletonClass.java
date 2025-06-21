public class SingletonClass {
    static class Sigleton{
        // initialize singleton class initially defined to null.
        private static Sigleton instance = null;

        // Create a private constructor so no one can call me outside the class.
        private Sigleton(){
            System.out.println("Createing SingleTon Class");
        }

        // Create a public method that you have to call outside the class.
        public static Sigleton getInstance(){
            // For first time.
            if(instance == null){
                instance = new Sigleton();
            }
            // if already initialzation return the same object.
            return instance;
        }
    }
    public static void main(String[] args) {
        // 🔹 What is a Singleton Class?.
        //  Sigleton class is allow you create only one object (instance)
        //  of an class in your whole program.
        // -> it not allow to create multile object of it like previous we did.

        // Example : Iamgine a printer in a school everyone is using that printer
        // if anyone try to create new printer system should block it.

        // Use Cases : Data Base connection.

        //  Use sigleton class : see line no 2 .
        Sigleton objOfSigleton1 = Sigleton.getInstance();
        Sigleton objOfSigleton2 = Sigleton.getInstance();

        if(objOfSigleton1 == objOfSigleton2){
            System.out.println("both are equal pointing to same obj...");
        }
    }
}
