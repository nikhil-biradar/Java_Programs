package practice_programs.string;

public class HashcodeOfString {
    public static void main(String[] args) {

        String s1 = "Nikhil";
        String s2 = "Nikhil";

        String s3 = new String("Nikhil");
        String s4 = new String("Nikhil");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());

    }
}