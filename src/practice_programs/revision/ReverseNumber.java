package practice_programs.revision;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        int temp = num;
        int rev = 0;

        while(temp > 0){
            rev = (temp % 10) + rev * 10;
            temp /= 10;
        }
        System.out.println("Reversed Number is : " + rev);
    }
}