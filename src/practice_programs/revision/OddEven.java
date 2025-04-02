package practice_programs.revision;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int a = sc.nextInt();

        if(a % 2 == 0){
            System.out.print( a + " is Even.");
        }else{
            System.out.print( a + " is Odd");
        }
    }
}