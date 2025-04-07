package practice_programs.revision;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();  // Taking user input

        System.out.println("Prime numbers up to " + num + ":");

        for (int i = 2; i <= num; i++) { // Start from 2 as 1 is not prime
            int count = 0;

            for (int j = 1; j <= i; j++) { // Checking divisibility
                if (i % j == 0) {
                    count++;
                }
            }

            if (count == 2) { // Prime numbers have exactly 2 divisors
                System.out.print(i + " ");
            }
        }

        sc.close(); // Closing scanner
    }
}
