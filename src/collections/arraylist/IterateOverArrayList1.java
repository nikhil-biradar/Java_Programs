//2. Write a Java program to iterate through all elements in an array list.

package collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterateOverArrayList1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("White");
        list.add("Pink");
        list.add("Orange");
        list.add("Black");
        list.add("Purple");
        list.add("Blue");
        list.add("Red");

        System.out.println("Iterate over ArrayList : ");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }
}
