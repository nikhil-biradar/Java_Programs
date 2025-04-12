package collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class IsEmpty {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        System.out.println(list.isEmpty());

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("Original List : " + list);


    }
}
