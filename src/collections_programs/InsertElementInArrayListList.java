//3. Write a Java program to insert an element into the array list at the first position.

package collections_programs;

import java.util.ArrayList;
import java.util.List;

public class InsertElementInArrayListList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Orange");
        list.add("Pineapple");
        list.add("Sugarcane");

        System.out.println("List Befor Adding new Element : " + list);
        list.add(0, "Mango");

        System.out.println("List After Adding new Element : " + list);
    }
}
