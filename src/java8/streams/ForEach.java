package java8.streams;

import java.util.stream.Stream;

public class ForEach {
    public static void main(String[] args) {

        Stream.of("First", "Second", "First", "Third", "Fourth").limit(3).distinct().forEach(System.out::println);
    }
}
