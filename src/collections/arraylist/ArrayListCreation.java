package collections.arraylist;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListCreation {
    public static void main(String[] args) {

        //1st way to create arraylist
        ArrayList <Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(2, 60);

        System.out.println(list);

        //2nd way to create arrayList
        List<String> list1 = Arrays.asList("Monday", "Tuesday", "Wednesday");
        System.out.println(list1);

        //3rd by String array
        String array [] = {"Mango", "Banana", "Apple"};
        List <String> list2 = Arrays.asList(array);
        System.out.println(list2);

    }
}
