package collections.comparator_interface;

import collections.comparable_interface.Student;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class StudentDes implements Comparator<Integer> {

    @Override
    public int compare(Integer i1, Integer i2) {
        return i2.compareTo(i1);
    }

    public static void main(String[] args) {
        StudentDes s = new StudentDes();
        Set<Integer> set = new TreeSet<>(s);

        set.add(55);
        set.add(45);
        set.add(60);
        set.add(25);
        set.add(95);

        System.out.println("Sorted in Descending Order : ");
        for (Integer i : set){
            System.out.print(i + " ");
        }
    }
}