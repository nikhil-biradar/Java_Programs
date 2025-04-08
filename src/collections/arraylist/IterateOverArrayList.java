package collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterateOverArrayList {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.add("Red");
        list.add("White");
        list.add("Green");
        list.add("Black");
        list.add("Violet");

        // 1) Using for each loop
        System.out.println("Using for each loop : ");
        for(String str : list){
            System.out.print(str + " ");
        }

        // 2) Using for loop
        System.out.println();
        System.out.println("\nUsing for loop : ");
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }

        // 3) Using while loop
        System.out.println();
        int i = 0;
        System.out.println("\nUsing while loop");
        while (list.size() > i){
            System.out.print(list.get(i) + " ");
            i++;
        }

        // 4) Using Iterator
        System.out.println();
        System.out.println("\nUsing Iterator : ");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

        // 5) Using ListIterator
        System.out.println();
        System.out.println("\nUsing ListIterator : ");
        ListIterator<String> iterator1 = list.listIterator();
        while (iterator1.hasNext()){
            System.out.print(iterator1.next() + " ");
        }

        // 6) Using ListIterator in Backward Direction
        System.out.println();
        System.out.println("\nUsing ListIterator in Backward Direction : ");
        ListIterator<String> iterator2 = list.listIterator(list.size());
        while (iterator2.hasPrevious()){
            System.out.print(iterator2.previous() + " ");
        }
    }
}