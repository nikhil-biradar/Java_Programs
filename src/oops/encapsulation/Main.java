package oops.encapsulation;

class BankAccount {
    private static double interestRate = 5.0;  // Private static variable

    // Static getter for interest rate
    public static double show() {
        return interestRate;
    }

    // Static setter for interest rate
    public static void test(double rate) {
        if (rate > 0) {
            interestRate = rate;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Accessing encapsulated static data via static methods
        System.out.println("Interest Rate: " + BankAccount.show());
        BankAccount.test(6.5);
        BankAccount.test(6);
        System.out.println("Updated Interest Rate: " + BankAccount.show());
    }
}