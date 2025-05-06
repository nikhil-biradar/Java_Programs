package java8.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DistinctFromTwoLists {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(7);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(8);

        List<Integer> uncommon = Stream.concat(list1.stream(), list2.stream())  // Combine both lists
                .filter(i -> !(list1.contains(i) && list2.contains(i)))  // Exclude common elements
                .distinct()  // Remove duplicates
                .collect(Collectors.toList());
        System.out.println(uncommon);
    }
}