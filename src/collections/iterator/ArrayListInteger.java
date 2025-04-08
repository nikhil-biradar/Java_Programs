package collections.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListInteger {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.print(list + " ");

        System.out.println("\nUsing Iterator : ");
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
    }
}