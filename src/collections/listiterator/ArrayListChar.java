package collections.listiterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListChar {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        list.add('A');
        list.add('B');
        list.add('C');

        ListIterator<Character> iterator = list.listIterator();
        System.out.println("Forward Direction Iteration : ");
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

        System.out.println("\nBackward Direction Iteration : ");
        while(iterator.hasPrevious()){
            System.out.print(iterator.previous() + " ");
        }
    }
}
