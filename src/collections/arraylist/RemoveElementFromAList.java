//6. Write a Java program to remove the third element from an array list.
package collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementFromAList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Original List : " + list);
        list.remove(3);
        System.out.println("List After Removing 3rd element : " + list);
    }
}
