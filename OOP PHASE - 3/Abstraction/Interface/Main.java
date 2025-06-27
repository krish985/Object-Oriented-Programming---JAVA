package Interface;
import java.util.Scanner;

public class Main {
    // Interface Implementation.
    interface UpiPayment {
        void payViaUpi(int amount);
    }

    interface WalletMethod {
        void payViaWalletMethod(int amount);
    }

    interface NetBanking {
        void payViaNetBanking(int amount);
    }

    public static abstract class PaymentProcessor {
        public void generateReceipt(String mode, int amount) {
            System.out.println("----- PAYMENT RECEIPT -----");
            System.out.println("Mode: " + mode);
            System.out.println("Amount: ₹" + amount);
        }
    }

    public static class PhonePe extends PaymentProcessor implements UpiPayment, WalletMethod, NetBanking {
        @Override
        public void payViaNetBanking(int amount) {
            System.out.println("Paid ₹" + amount + " via NetBanking using PhonePe.");
            generateReceipt("NetBanking", amount);
        }

        @Override
        public void payViaUpi(int amount) {
            System.out.println("Paid ₹" + amount + " via UPI using PhonePe.");
            generateReceipt("UPI", amount);
        }

        @Override
        public void payViaWalletMethod(int amount) {
            System.out.println("Paid ₹" + amount + " via Wallet using PhonePe.");
            generateReceipt("Wallet", amount);
        }
    }

    public static void main(String[] args) {
        // 📘 What is an interface.
        // -> An interface in java is blueprint of an class
        // -> and use to be achieve 100 % abstraction.
        // -> You can also say interface like a contract.

        // You can't be create object of interface .

        // ✅ Features of the Complex Scenario
        // -> Multiple Interfaces: UpiPayment, WalletPayment, NetBanking
        // -> An Abstract Class: PaymentProcessor for common functionality like
        // -> One Class Implements Multiple Interfaces + Extends Abstract Class: PhonePe
        // -> Polymorphism: Use interface references
        // -> Real-like Flow: User selects a payment method via menu

        // Start program.
        Scanner scn = new Scanner(System.in);
        PhonePe phonePe = new PhonePe();

        while (true) {
            System.out.println("Select Payment Method:");
            System.out.println("1. UPI");
            System.out.println("2. Wallet");
            System.out.println("3. NetBanking");
            System.out.println("4. Exit");

            // Take input from user.
            int choice = scn.nextInt();

            // Exit condition.
            if (choice == 4) {
                break;
            }

            System.out.print("Enter Amount: ₹");
            int amount = scn.nextInt();

            switch (choice) {
                case 1:
                    UpiPayment upi = phonePe;
                    upi.payViaUpi(amount);
                    break;
                case 2:
                    WalletMethod wallet = phonePe;
                    wallet.payViaWalletMethod(amount);
                    break;
                case 3:
                    NetBanking net = phonePe;
                    net.payViaNetBanking(amount);
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
        System.out.println("Thanks for using PhonePe Payment App.");
        scn.close();
    }
}
