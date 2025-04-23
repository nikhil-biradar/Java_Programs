package java8.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamFromCollection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        list.stream().forEach(System.out::println);

        List<String> list1 = List.of("Sam", "Altman", "Elon", "Musk");
        list1.stream().forEach(System.out::println);
    }
}