//9. Write a Java program to copy one array list into another.
package collections_programs;

import java.util.ArrayList;
import java.util.List;

public class CopyArraylist {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("Original List : " + list);

        List<Integer> list1 = new ArrayList<>();
        list1.add(40);
        list1.add(50);
        list1.add(60);

        list.addAll(list1);
        System.out.println("List after copy : " + list);
    }
}
