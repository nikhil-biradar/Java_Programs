package practice_programs.basic;

/*
public class Armstrong {
    public static void main(String[] args) {
        int num = 1534;
        int result = 0;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            result += digit * digit * digit;
            temp /= 10;
        }

        if (num == result) {
            System.out.println("Number is Armstrong");
        } else {
            System.out.println("Number is not Armstrong");
        }
    }
}*/


import java.util.Scanner;

public class Armstrong {
    public void isArmstrong(int num){
        int result = 0;
        int temp = num;

        while(temp > 0){
            int digit = temp % 10;
            result += digit * digit * digit;
            temp /= 10;
        }

        if(result == num){
            System.out.println("Number is Armstrong");
        }else {
            System.out.println("Number is not Armstrong");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();

        Armstrong armstrong = new Armstrong();
        armstrong.isArmstrong(num);
    }
}