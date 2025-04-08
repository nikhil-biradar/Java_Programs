package collections.listiterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListStrBothDir {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Green");
        list.add("Red");
        list.add("Yellow");
        list.add("White");
        list.add("Black");

        ListIterator<String> iterator = list.listIterator();
        System.out.println("Forward Direction Iteration : ");
        while (iterator.hasNext()){
            int index = iterator.nextIndex();
            String element = iterator.next();
            System.out.println("Index : " + index + " Element : " + element);
        }

        System.out.println("\nBackward Direction Iteration : ");
        while (iterator.hasPrevious()){
            int index = iterator.previousIndex();
            String element = iterator.previous();
            System.out.println("Index : " + index + " Element : " + element);
        }
    }
}
