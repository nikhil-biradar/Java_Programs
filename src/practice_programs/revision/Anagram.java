package practice_programs.revision;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First String : ");
        String s1 = sc.nextLine();
        System.out.print("Enter Second String : ");
        String s2 = sc.nextLine();

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if (s1.length() != s2.length()) {
            System.out.println("Strings are not Anagram");
        } else {
            char[] a1 = s1.toCharArray();
            char[] a2 = s2.toCharArray();

            Arrays.sort(a1);
            Arrays.sort(a2);

            if(Arrays.equals(a1,a2) == true){
                System.out.println("Strings are Anagram");
            }else {
                System.out.println("Strings are not Anagram");
            }

        }
    }
}