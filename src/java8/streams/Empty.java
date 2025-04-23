package java8.streams;

import java.util.stream.Stream;

public class Empty {
    public static void main(String[] args) {
        Stream<String> emptyStream = Stream.empty();
        System.out.println("Count : " + emptyStream.count());
    }
}