package java8.lambda_expressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyClass {

    //Before java 8 we need to override compare method

   /* @Override
    public int compare(Integer a, Integer b) {
        return b - a;
    }
*/

    //Using Lambda Expression
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(55);
        list.add(20);
        list.add(35);
        list.add(100);

        Collections.sort(list, (a, b) -> b - a);
        System.out.println(list);
    }
}
