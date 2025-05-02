//8. Write a Java program to sort a given array list.
package collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class SortAnArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(10);
        list.add(35);
        list.add(20);
        list.add(40);

        System.out.println("Original List : " + list);

        for(int i=0; i<list.size(); i++){
            for(int j=0; j< list.size()-i-1; j++){
                if(list.get(j) > list.get(j+1)){
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        System.out.println("List after sorting : " + list);
    }
}
