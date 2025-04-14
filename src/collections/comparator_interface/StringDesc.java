package collections.comparator_interface;

import java.util.Comparator;
import java.util.TreeSet;

public class StringDesc implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s1.compareTo(s2);
//        return s2.compareTo(s1);
    }

    public static void main(String[] args) {
        StringDesc s = new StringDesc();

        TreeSet<String> treeSet = new TreeSet<>(s);
        treeSet.add("Zebra");
        treeSet.add("Dog");
        treeSet.add("Elephant");
        treeSet.add("Buffalo");
        treeSet.add("Cow");
        treeSet.add("Yak");
        treeSet.add("Cat");

        System.out.println("Displyaing elements in Descending Order : ");

        for (String str : treeSet){
            System.out.print(str + " ");
        }
    }
}