package collections.comparator_interface;

import java.util.Comparator;
import java.util.TreeSet;

public class StudentAsc implements Comparator<Integer> {
    @Override
    public int compare(Integer i1, Integer i2) {
        return i1.compareTo(i2);
    }

    public static void main(String[] args) {
        StudentAsc s = new StudentAsc();
        TreeSet<Integer> treeSet = new TreeSet<>(s);

        treeSet.add(25);
        treeSet.add(15);
        treeSet.add(20);
        treeSet.add(55);
        treeSet.add(35);

        System.out.println("Sorted in Ascending Order : ");
        for(Integer i : treeSet){
            System.out.print(i + " ");
        }
    }
}
