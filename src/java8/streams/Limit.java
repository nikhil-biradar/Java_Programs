package java8.streams;

import java.util.ArrayList;
import java.util.List;

public class Limit {
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

        names.stream().limit(4).forEach(System.out::println);
    }
}