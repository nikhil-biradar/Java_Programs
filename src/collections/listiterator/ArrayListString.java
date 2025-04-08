package collections.listiterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListString {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        ListIterator<String> iterator = list.listIterator();
        System.out.println(iterator.hasNext()); //Checks is elements present in

        int indexA = iterator.nextIndex();
        String elementA = iterator.next();
        System.out.println("Index : " + indexA + " ELement : " + elementA);

        int indexB = iterator.nextIndex();
        String elementB = iterator.next();
        System.out.println("Index : " + indexB + " ELement : " + elementB);

        int indexC = iterator.nextIndex();
        String elementC = iterator.next();
        System.out.println("Index : " + indexC + " ELement : " + elementC);

        System.out.println(iterator.hasNext());

        System.out.println(iterator.next());

    }
}
