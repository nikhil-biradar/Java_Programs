package collections.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class IterateOverLinkedlist {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Pink");
        list.add("Orange");
        list.add("White");
        list.add("Black");
        list.add("Purple");

        System.out.println("Original List : " + list);

        System.out.println("\nUsing for loop : ");
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }

        System.out.println("\n");
        System.out.println("Using while loop : ");
        int i=0;
        while (i < list.size()){
            System.out.print(list.get(i) + " ");
            i++;
        }

        System.out.println("\n");
        System.out.println("Using for each loop : ");
        for(String s : list){
            System.out.print(s + " ");
        }

        System.out.println("\n");
        System.out.println("Using Iterator : ");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

        System.out.println("\n");
        System.out.println("Using List Iterator : ");
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()){
            System.out.print(listIterator.next() + " ");
        }

        System.out.println("\n");
        System.out.println("Iterate in Backward Direction : ");
        while (listIterator.hasPrevious()){
            System.out.print(listIterator.previous() + " ");
        }
    }
}
