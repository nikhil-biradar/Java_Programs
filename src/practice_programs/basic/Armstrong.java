package practice_programs.basic;

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
}