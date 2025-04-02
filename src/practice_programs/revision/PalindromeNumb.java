package practice_programs.revision;

import java.util.Scanner;

public class PalindromeNumb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        int rev = 0;
        int temp = num;

        while(temp != 0){
            rev = (temp % 10) + rev * 10;
            temp /= 10;
        }
        if(rev == num){
            System.out.println(num + " is Palindrome Number");
        }else {
            System.out.println(num + " is not a Palindrome Number");
        }
    }
}
