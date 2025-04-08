package collections.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterateOverList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Mango");
        list.add("Banana");
        list.add("Cherry");
        list.add("Apple");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}