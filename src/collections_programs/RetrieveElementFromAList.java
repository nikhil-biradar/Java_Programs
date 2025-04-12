//4. Write a Java program to retrieve an element (at a specified index) from a given array list.
package collections_programs;

import java.util.ArrayList;
import java.util.List;

public class RetrieveElementFromAList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("White");
        list.add("Pink");
        list.add("Orange");
        list.add("Black");

        System.out.println("List Before Adding new Element : " + list);

        System.out.println("Element at index 2 : " + list.get(2));
    }
}
