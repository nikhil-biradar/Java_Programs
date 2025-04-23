package java8.streams;

import java.util.List;

public class Filter {
    public static void main(String[] args) {
        List<String> names = List.of("Nikhil", "Nitin", "Ashish", "Vighnesh");

        //Before Stream
        for (String s : names){
            if(s.length() > 5){
                System.out.print(s + " ");
            }
        }

        //After Stream
        names.stream().filter( name -> name.length() > 5).forEach(System.out::println);
    }
}