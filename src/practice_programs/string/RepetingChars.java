package practice_programs.string;

public class RepetingChars {
    public static void main(String[] args) {
        String s = "programming";
        int count = 0;

        for(int i=0; i<s.length(); i++){
            for(int j=0; j<s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    count++;
                }
            }
            if(count > 1){
                System.out.print(s.charAt(i) + " ");
            }
        }
    }
}
