package java8.streams;

import java.util.ArrayList;
import java.util.List;

public class AnyMatch {
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

        if(names.stream().anyMatch((String name) -> name.length() == 50)){
            System.out.println("Yes... There is a name exist with 5 letters");
        }else {
            System.out.println("No! There is no name exist with 5 letters");
        }

    }
}
