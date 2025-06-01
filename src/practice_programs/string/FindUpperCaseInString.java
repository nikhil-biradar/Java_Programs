package practice_programs.string;

public class FindUpperCaseInString {
    public static void main(String[] args) {

        String s = "Nikhil Biradar";
        StringBuilder a = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            char arr = s.charAt(i);
            if(arr == Character.toUpperCase(arr)) {
                a.append(arr);
            }
        }
        System.out.println(a);
    }
}