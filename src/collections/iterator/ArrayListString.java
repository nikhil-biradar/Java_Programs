package collections.iterator;

import java.util.Iterator;
import java.util.List;

public class ArrayListString {
    public static void main(String[] args) {
        List<String> list = new java.util.ArrayList<>();
        list.add("JAVA");
        list.add("PYTHON");
        list.add("JAVASCRIPT");
        list.add("RUBY");
        list.add("C++");

        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            String str = itr.next();
            System.out.print(str + " ");
        }
    }
}