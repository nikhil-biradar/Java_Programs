package collections.map;

import java.util.HashMap;
import java.util.Map;

public class Employee {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 10);
        map.put("two", 20);
        map.put("three", 30);
        map.put("four", 40);

        System.out.println("one".hashCode());
        System.out.println("two".hashCode());
        System.out.println("three".hashCode());
        System.out.println("four".hashCode());

        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}