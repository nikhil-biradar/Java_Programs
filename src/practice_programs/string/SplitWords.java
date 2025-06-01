package practice_programs.string;

public class SplitWords {
    public static void main(String[] args) {
        String s1 = "I love Java Technology";
        String [] s2 = s1.split(" ");

        for(int i = 0; i < s2.length; i++){
            System.out.println(s2[i] + " ");
        }
        System.out.println(s2.length);
    }
}
