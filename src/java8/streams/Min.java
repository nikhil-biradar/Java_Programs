package java8.streams;

import java.sql.Array;
import java.util.Arrays;
import java.util.OptionalInt;

public class Min {
    public static void main(String[] args) {

        OptionalInt min = Arrays.stream(new int[] {1, 2, 3, 8, 5}).min();
        System.out.println(min);
    }
}
