package collections.comparator_interface;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayAsc implements Comparator<Integer> {
    @Override
    public int compare(Integer i1, Integer i2) {
        return i1.compareTo(i2);
    }

    public static void main(String[] args) {
        Integer arr [] = {10, 50, 30, 40, 70};

        ArrayAsc asc = new ArrayAsc();
        Arrays.sort(arr, asc);

        System.out.println("Sorting array in Ascending Order : ");
        for (Integer i : arr){
            System.out.print(i + " ");
        }
    }
}
