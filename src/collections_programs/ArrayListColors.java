//1. Write a Java program to create an array list, add some colors (strings) and print out the collection.
package collections_programs;

import java.util.ArrayList;
import java.util.List;

public class ArrayListColors {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("White");
        list.add("Pink");
        list.add("Orange");
        list.add("Black");
        list.add("Purple");
        list.add("Blue");
        list.add("Red");

        System.out.println("List of Colors : " + list);
    }
}
