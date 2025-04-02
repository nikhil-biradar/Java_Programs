package practice_programs.revision;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();

        System.out.println("Before Swapping : ");
        System.out.println("First Number is " + a + " Second Number is " + b);
        System.out.println("After Swapping : ");

//        int temp = a;
//        a = b;
//        b = temp;

//        a = a + b;
//        b = a - b;
//        a = a - b;

        a = a * b;
        b = a / b;
        a = a / b;

        System.out.println("First Number is " + a + " Second Number is " + b);
    }
}