package practice_programs.revision;

import java.util.Scanner;

public class PalindromeStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();
        String rev = "";

        for (int i = str.length()-1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("String is Palindrome");
        }else{
            System.out.println("String is not Palindrome");
        }
    }
}