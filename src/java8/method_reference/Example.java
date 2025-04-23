package java8.method_reference;

import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<String> names = List.of("Nikhil, Amit, Shreya");

        names.forEach(System.out::println);
    }
}