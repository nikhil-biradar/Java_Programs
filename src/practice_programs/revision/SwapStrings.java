package practice_programs.revision;

public class SwapStrings {
    public static void main(String[] args) {
        String s1 = "Nikhil";
        String s2 = "Nitin";
        System.out.println("Strings before Swapping : " + s1 + " " + s2);
        s1 = s1.concat(s2);
        s2 = s1.substring(0, (s1.length()-s2.length()));
        s1 = s1.substring(s2.length());
        System.out.println("Strings before Swapping : " + s1 + " " + s2);
    }
}