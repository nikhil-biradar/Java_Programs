package collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterateOverAnArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Nikhil");
        list.add("Nitin");
        list.add("Akshay");
        list.add("Ashish");
        list.add("Sonali");

        Iterator<String> iterator = list.iterator();
        System.out.println();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

        System.out.println("\n");
        for(String s : list){
            System.out.print(s + " ");
        }

        ListIterator<String> iterator1 = list.listIterator();
        System.out.println("\n");
        while(iterator1.hasNext()){
            System.out.print(iterator1.next() + " ");
        }

        System.out.println("\n");
        while(iterator1.hasPrevious()){
            System.out.print(iterator1.previous() + " ");
        }

        System.out.println("\n");
        for(String s1 : list){
            System.out.print(s1 + " ");
        }
    }
}
