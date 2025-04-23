package java8.streams;

import java.util.ArrayList;
import java.util.List;

public class NoneMatchFound {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Nikhil");
        names.add("Aditya");
        names.add("Nitin");
        names.add("Akshay");
        names.add("Ashish");
        names.add("Nutan");
        names.add("Sarang");
        names.add("Saniya");

        if (names.stream().noneMatch((String name) -> name.length() == 2)){
            System.out.println("No Match Found");
        }else {
            System.out.println("Match Found");
        }
    }
}