package java8.streams;

import java.util.ArrayList;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Nikhil");
        names.add("Aditya");
        names.add("Nitin");
        names.add("Akshay");
        names.add("Pawan");
        names.add("Yash");
        names.add("Vivek");
        names.add("Saurabh");

        names.stream().sorted().forEach(System.out::println);
    }
}