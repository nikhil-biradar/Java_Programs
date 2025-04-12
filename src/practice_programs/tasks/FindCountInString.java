package practice_programs.tasks;

public class FindCountInString {
    public static void main(String[] args) {
        String s = "Java Program123$ test@gmail.com";

        int letters = 0;
        int specCharCount = 0;
        int numbers = 0;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')){
                letters++;
            }else if (ch >= '0' && ch <= '9') {
                numbers++;
            } else if (ch != ' '){
                specCharCount++;
            }
        }
        System.out.println("Character Count : " + letters + "\nSpecial Character Count : " + specCharCount + "\nNumber Count : " + numbers);
    }
}