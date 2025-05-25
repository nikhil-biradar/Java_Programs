package java8.streams;

import java.util.Arrays;
import java.util.List;

public class OddEven {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 47, 69, 38, 92, 74, 259, 47);

        List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).toList();
        System.out.println(evenNumbers);

        List<Integer> oddNumbers = numbers.stream().filter(n -> n % 2 != 0).toList();
        System.out.println(oddNumbers);

        numbers.stream().distinct().forEach(System.out::println);
    }
}