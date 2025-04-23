package java8.streams;

import java.util.ArrayList;
import java.util.List;

public class Count {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Nikhil");
        names.add("Aditya");
        names.add("Nitin");
        names.add("Akshay");
        names.add("Ashish");
        names.add("Nikhil");
        names.add("Ashish");
        names.add("Akshay");

        long count = names.stream().filter((String name) -> name.length() > 5).count();
        System.out.println(count);
    }
}