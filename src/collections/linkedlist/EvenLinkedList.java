package collections.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class EvenLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        for(int i=0; i<=20; i++){
            if(i % 2 == 0){
                list.add(i);
            }
        }
        System.out.println("Original List : " + list);
        System.out.println("First Even Number : " + list.getFirst());
        System.out.println("Last Even Number : " + list.getLast());
        System.out.println("Element at index 5 : " + list.get(5));
        System.out.println("Peek First Element : " + list.peekFirst());
        System.out.println("Peek Last Element : " + list.peekLast());
        System.out.println("Poll First Element : " + list.pollFirst());
        System.out.println("Poll Last Element : " + list.pollLast());
        System.out.println("Modified List : " + list);
    }
}