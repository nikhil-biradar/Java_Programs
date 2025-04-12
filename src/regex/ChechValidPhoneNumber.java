package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChechValidPhoneNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Phone Number : ");
        String str = sc.nextLine();

        Pattern pattern = Pattern.compile("^\\+91\\d{10}$");
        Matcher matcher = pattern.matcher(str);
        boolean b = matcher.matches();
        if (b){
            System.out.println("Phone number is Valid");
        }else {
            System.out.println("Phone number is not Valid");
        }
    }
}
