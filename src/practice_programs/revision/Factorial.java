package practice_programs.revision;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.print("Enter a Number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = 1;

        for(int i = 1; i <= num; i++){
            fact *= i;
        }
        System.out.println("Factorial of " + num + " is : " + fact);
    }
}