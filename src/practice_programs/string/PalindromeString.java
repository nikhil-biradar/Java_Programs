package practice_programs.string;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();

        String rev = "";

        for(int i = str.length()-1; i>=0; i--){
            rev += str.charAt(i);
        }

        if(str.equals(rev)){
            System.out.println("Palindrome String");
        }else{
            System.out.println("Not a Palindrome String");
        }
    }
}