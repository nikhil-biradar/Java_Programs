package collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class AddAll {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("J");
        list.add("K");
        list.add("L");
        list.add("M");
        System.out.println(list);

        List<String> list1 = new ArrayList<>();
        list1.add("N");
        list1.add("O");
        list1.add("P");

        list.addAll(4, list1);
        System.out.println(list);

        List<String> list2 = new ArrayList<>();
        list2.add("10");
        list2.add("20");
        list2.add("30");

        list.addAll(list2);
        System.out.println(list);
    }
}