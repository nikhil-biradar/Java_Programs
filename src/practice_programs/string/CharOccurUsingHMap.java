package practice_programs.string;

import java.util.HashMap;
import java.util.Map;

public class CharOccurUsingHMap {
    public static void main(String[] args) {
        String str = "Java J2EE Java JSP J2EE";

        Map<Character, Integer> charCountMap = new HashMap<>();

        char [] strArray = str.toCharArray();

        for(char c : strArray){
            if(c == ' '){
                continue;
            }
            if(charCountMap.containsKey(c)){
                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else {
                charCountMap.put(c, 1);
            }
        }
        System.out.println("Character Occurrence : " + charCountMap);
    }
}
