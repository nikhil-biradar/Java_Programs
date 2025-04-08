package collections.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListChar {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');

        Iterator<Character> itr = list.iterator();

        while (itr.hasNext()){
            System.out.print(itr.next() + " ");
        }

    }
}