package collections.comparator_interface;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayDesc implements Comparator<Integer> {
    @Override
    public int compare(Integer i1, Integer i2) {
        return i2.compareTo(i1);
    }

    public static void main(String[] args) {
        Integer arr [] = new Integer[6];
        arr[0] = 60;
        arr[1] = 30;
        arr[2] = 40;
        arr[3] = 10;
        arr[4] = 20;
        arr[5] = 20;

        ArrayDesc des = new ArrayDesc();
        System.out.println("Sorting in Descending Order : ");
        Arrays.sort(arr, des);

        for (Integer i : arr){
            System.out.print(i + " ");
        }
    }
}