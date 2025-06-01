package practice_programs.basic;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();

        boolean isPrime = true;

        /*if (num < 2){
            isPrime = false;
        }*/

        int i = 2;
        while(i < num){
            if(num % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }

        if(isPrime){
            System.out.println("Number is Prime");
        }else {
            System.out.println("Number is not Prime");
        }
    }
}