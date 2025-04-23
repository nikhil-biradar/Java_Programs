package java8.streams;

import java.util.ArrayList;
import java.util.List;

public class SortUsingComparator {
    public static void main(String[] args) {
        List<String > names = new ArrayList<>();
        names.add("Nikhil");
        names.add("Aditya");
        names.add("John");
        names.add("Akshay");
        names.add("Pawan");
        names.add("Yash");
        names.add("Vivek");
        names.add("Saurabh");

        System.out.println("Ascending Soting : ");
        names.stream().sorted((String name1, String name2) -> name1.length() - name2.length()).forEach(System.out::println);

        System.out.println("\nDescending Sorting : ");
        names.stream().sorted((String names1, String names2) -> names2.length() - names1.length()).forEach(System.out::println);

    }
}