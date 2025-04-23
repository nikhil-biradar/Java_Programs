package java8.streams;

import java.util.stream.Stream;

public class MultipleElements {
    public static void main(String[] args) {
        Stream<Integer> streamOfNumbers = Stream.of(5, 6, 8, 2, 9, 4, 7);
        System.out.println("Count : " + streamOfNumbers.count());
    }
}