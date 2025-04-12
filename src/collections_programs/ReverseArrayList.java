package collections_programs;

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

        System.out.println("Original List : ");
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()){
            System.out.print(listIterator.next() + " ");
        }

        System.out.println("\n");
        System.out.println("Reversed List : ");
        while (listIterator.hasPrevious()){
            System.out.print(listIterator.previous() + " ");
        }
    }
}
