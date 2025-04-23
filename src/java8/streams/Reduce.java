package java8.streams;

import java.util.Arrays;
import java.util.OptionalInt;

public class Reduce {
    public static void main(String[] args) {

        int sum = Arrays.stream(new int [] {1, 2, 3, 4, 5}).reduce(0, (a, b) -> a + b);
        System.out.println(sum);

    }
}