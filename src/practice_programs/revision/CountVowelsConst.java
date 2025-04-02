package practice_programs.revision;

public class CountVowelsConst {
    public static void main(String[] args) {
        String s1 = "Java is a very popular language";
        int vowelsCount = 0;
        int constCount = 0;
        s1 = s1.toLowerCase();

        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) == 'a' | s1.charAt(i) == 'e' | s1.charAt(i) == 'i' | s1.charAt(i) == 'o' | s1.charAt(i) == 'u'){
                vowelsCount++;
            }else {
                constCount++;
            }
        }
        System.out.println("Vowels are : " + vowelsCount);
        System.out.println("Consonents are : " + constCount);
    }
}
