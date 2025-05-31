package practice_programs.basic;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();

        boolean isPrime = true;
        if (num < 2) {
            isPrime = false;
        }

        /// Using For Loop
/*
		for(int i = 2; i < num; i++){
			if(num % i == 0){
				isPrime = false;
				break;
			}
		}
*/

        /// Using While Loop
        int i = 2;
        while (i < num) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }

        if (isPrime == true) {
            System.out.println(num + " is prime");
        } else {
            System.out.println(num + " is not prime");
        }
    }
}