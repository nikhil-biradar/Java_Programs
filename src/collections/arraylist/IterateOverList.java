package collections.arraylist;

import java.util.*;

public class IterateOverList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Original List : " + list);

        System.out.println("\nUsing Iterater : ");
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

        System.out.println("\n");
        System.out.println("Using ListIterator : ");
        ListIterator<Integer> iterator1 = list.listIterator();
        while (iterator1.hasNext()){
            System.out.print(iterator1.next() + " ");
        }

        System.out.println("\n");
        System.out.println("Using ListIterator Backward Direction : ");
        while (iterator1.hasPrevious()){
            System.out.print(iterator1.previous() + " ");
        }

        System.out.println("\n");
        System.out.println("Using Enumeration : ");
        Enumeration<Integer> enumeration = Collections.enumeration(list);
        while (enumeration.hasMoreElements()){
            System.out.print(enumeration.nextElement() + " ");
        }
    }
}