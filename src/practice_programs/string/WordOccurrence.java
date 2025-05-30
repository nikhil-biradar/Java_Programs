package practice_programs.string;

import java.util.Objects;

public class WordOccurrence {
    public static void main(String[] args) {
        String str = "Java is a programming language. Java is a platform independent language";

        String[] arr = str.split(" ");

        System.out.println("Total number of words in String : " + arr.length);

        System.out.println("Repeated Words : ");
        for (int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(Objects.equals(arr[i], arr[j])){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}