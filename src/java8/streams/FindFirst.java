package java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class FindFirst {
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

        Optional<String> firstName = names.stream().findFirst();
        System.out.println(firstName);

        Optional<String> anyName = names.stream().findAny();
        System.out.println(anyName);

        Optional<String> anyElement = Stream.of("First", "Second", "Third", "Fourth").findAny();
        System.out.println(anyElement);
    }
}
