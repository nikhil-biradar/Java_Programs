package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ArrayToStream {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Banana", "Apple", "Orange");
        Stream<String> stream1 = list.stream();

        String [] array = {"Banana", "Apple", "Orange"};
        Stream<String> stream2 = Arrays.stream(array);
        System.out.println(stream2);
    }
}