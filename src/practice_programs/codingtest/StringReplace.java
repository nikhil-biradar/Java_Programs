package practice_programs.codingtest;

public class StringReplace {
    public static void main(String[] args) {
        String str = "Tomorrow Teeth";
        String s2 = str.replace("o", "3").replace("m", "6").replace("r", "4").replace("e", "5");
        System.out.println(s2);
    }
}