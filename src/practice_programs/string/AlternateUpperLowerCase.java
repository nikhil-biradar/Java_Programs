package practice_programs.string;

public class AlternateUpperLowerCase {
    public static void main(String[] args) {

        String str = "nikhil";
        StringBuilder newString = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);

            if(i % 2 == 0){
                newString.append(Character.toUpperCase(c));
            }else{
                newString.append(Character.toLowerCase(c));
            }
        }
        System.out.println(newString);
    }
}