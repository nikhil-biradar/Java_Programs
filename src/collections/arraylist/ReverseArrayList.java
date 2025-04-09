package collections.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ReverseArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        ListIterator<Integer> iterator = list.listIterator();

        System.out.println("Elements : ");
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

        System.out.println("\n");
        System.out.println("Elements in Reverse Order : ");
        while (iterator.hasPrevious()){
            System.out.print(iterator.previous() + " ");
        }
    }
}
