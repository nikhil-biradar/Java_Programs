package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckValidEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an email : ");
        String str = sc.nextLine();

        Pattern pattern = Pattern.compile("^[a-zA-Z0-9._$-]+@[a-zA-Z0-9]+\\.[a-zA-z]{2,}$");
        Matcher matcher = pattern.matcher(str);
        boolean b = matcher.matches();
        if (b){
            System.out.println("Email is Valid");
        }else {
            System.out.println("Email is not Valid");
        }
    }
}