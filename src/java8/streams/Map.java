package java8.streams;

import java.util.ArrayList;
import java.util.List;

public class Map {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Nikhil");
        names.add("Aditya");
        names.add("Nitin");
        names.add("Akshay");
        names.add("Ashish");
        names.add("Nikhil");
        names.add("Vivek");
        names.add("Saurabh");

        names.stream().map(String :: length).forEach(System.out::println);
    }
}