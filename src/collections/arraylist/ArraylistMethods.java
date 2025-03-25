package collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArraylistMethods {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        List<Object> list1 = new ArrayList<>();

        //1) Add
        list.add(10);
        list.add(20);
        list.add(40);
        list.add(2.5);

        //2) Add(index, Object)
        list.add(2, 30);

        //3) AddAll
        list1.addAll(list);

        //4) Remove
        list.remove(Integer.valueOf(40));

        //5) Get value using Index
        list.get(2); //sout required to see output

        //6) Get Index using value
        list.indexOf(10); //sout required to see output

        //7) Get last index of
        System.out.println(list.lastIndexOf(2.5));

        //8) set value i.e. replace
        list.set(1, 50);

        //9) Check is elements present in list
        System.out.println(list.contains(30));

        //10) Size
        System.out.println(list.size());

        System.out.println(list);
//        System.out.println(list1);

    }
}
