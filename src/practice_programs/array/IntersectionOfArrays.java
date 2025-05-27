package practice_programs.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class IntersectionOfArrays {
    public static void main(String[] args) {

        String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};

        String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};

        /// First way
        Set<String> set = new HashSet<>();

        for (int i = 0; i < s1.length; i++){
            for(int j = 0; j < s2.length; j++){
                if(s1[i].equals(s2[j])){
                    set.add(s1[i]);
                }
            }
        }
        System.out.println("Intersection of two Arrays : " + set);

        /// Second way
        /// Using java 8 Stream Api
        Set<String> set1 = new HashSet<>(Arrays.asList(s2));
        Set<String> result = Arrays.stream(s1).filter(set1::contains).collect(Collectors.toSet());
        System.out.println(result);
    }
}