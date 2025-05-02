package java8.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct {
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

        names.stream().distinct().forEach(System.out::println);

        List<String> onlyOnce = names.stream()
                .filter(i -> Collections.frequency(names, i) == 1)
                .collect(Collectors.toList());

        System.out.println(onlyOnce);
    }
}