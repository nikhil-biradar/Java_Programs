package java8.streams;

import java.util.Arrays;
import java.util.OptionalInt;

public class Max {
    public static void main(String[] args) {

        OptionalInt max = Arrays.stream(new int [] {5, 7, 6, 8, 9}).max();
        System.out.println(max);
    }
}
