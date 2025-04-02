package practice_programs.revision;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.print("Enter a Year : ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(year % 4 == 0 & year % 100 != 0 | year % 400 == 0){
            System.out.println(year + " is Leap Year");
        }else {
            System.out.println(year + " is not Leap Year");
        }
    }
}
