package practice_programs.basic;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();

        int sqrt = (int) Math.sqrt(num);
        if(sqrt * sqrt == num){
            System.out.println("Number is Perfect Square.");
        }else {
            System.out.println(num + " is not Perfect Square");
        }
    }
}
