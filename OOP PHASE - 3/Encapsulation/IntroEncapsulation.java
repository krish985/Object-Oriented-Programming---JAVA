package Encapsulation;

class IntroEncapsulation {
    // ENCAPSULATION EXAMPLE.
    static class BankAccount {
        // Data hiding you can't accese directly from outside.
        private int AccountNumber = 12879;
        private String AccountHolderName;
        private long AccountBalance;

        // Create getter seeter make public so because outside the
        // class it Acceseable.
        // Getter.
        public void setAccountNumber(int AccountNumber) {
            this.AccountNumber = AccountNumber;
        }

        public void setAccountHolderName(String AccountHolderName) {
            this.AccountHolderName = AccountHolderName;
        }

        // Setter.
        public int getAccountNumber() {
            return AccountNumber;
        }

        public String getAccountHolderName() {
            return AccountHolderName;
        }

        public long getAccountBalance() {
            return AccountBalance;
        }

        // Deposite method.
        public void Deposite(int Balance) {
            if (Balance < 0) {
                System.out.println("Value must be > 0");
            } else {
                this.AccountBalance = Balance;
            }

        }

        // WithDraw Method.
        public void WithDraw(int ammount) {
            if (AccountBalance < ammount) {
                System.out.println("Insufficent Balance");
            } else {
                AccountBalance -= ammount;
            }
        }

    }

    public static void main(String[] args) {
        // ✅ What is Encapsulation in Java?
        // Encapsulation is a fundamental concept in Object-Oriented Programming (OOP)
        // -> It means wrapping data (variables) and code (methods) together as a single
        // -> unit and restricting direct access to some of the object's components.

        // 🧠 Why Use Encapsulation?
        // Data safety.
        // Better control of class fields.
        // Easy maintenance and testing.
        // Code modularity.

        // -> It gives you access control of your code via access modifier.
        // -> Also allow data hiding internal details are hidden from outside access.
        // -> allow getter setter method to access private data.
        // -> provide security sensitive data can't directly from outside.

        // Scenerio.
        // -> Create a Class BankAccount.
        // -> have private data member like , Account Number , Account holder name.
        // -> create geter setter use set the val or get the val.
        // -> also create withdraw method that withdraw money from the Account.

        // SEE LINE NO : 4.
        BankAccount person1 = new BankAccount();
        person1.setAccountHolderName("Alex");
        person1.setAccountNumber(12345);

        System.out.println("Account Number : " + person1.getAccountNumber());
        System.out.println("Account Holder Name : " + person1.getAccountHolderName());

        // Deposite value into bank
        System.out.println("Before Deposite : " + person1.getAccountBalance());
        person1.Deposite(5000);
        System.out.println("Curr Balance : " + person1.getAccountBalance());

        // Withdraw value into bank.
        person1.WithDraw(2000);
        System.out.println("Now Curr Balance : " + person1.getAccountBalance());
        person1.WithDraw(5000);

    }
}