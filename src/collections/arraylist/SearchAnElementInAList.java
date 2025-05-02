//7. Write a Java program to search for an element in an array list.
package collections.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchAnElementInAList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Original List : " + list);

        System.out.println("Enter a number to search: ");
        int num = sc.nextInt();
        boolean found = false;

        for (int i=0; i< list.size(); i++){
            if (num == list.get(i)){
                System.out.println("Element is found at index : " + i);
                found = true;
            }
        }
        if(!found){
            System.out.println("Element not found in the list.");
        }
    }
}
