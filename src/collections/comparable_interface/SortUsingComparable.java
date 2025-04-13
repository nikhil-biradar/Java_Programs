package collections.comparable_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortUsingComparable {
    public static void main(String[] args) {
        Student st1 = new Student("Nikhil", 201, 23);
        Student st2 = new Student("Nitin", 112, 25);
        Student st3 = new Student("Vikas", 303, 20);
        Student st4 = new Student("Pawan", 154, 31);


        List<Student> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);

        System.out.println("Displaying Students name by age : ");
        Collections.sort(list);

        for (Student str : list){
            System.out.println(str.name + " " + str.rollNo + " " + str.age);
        }
    }
}
