package collections.map;

import java.util.HashMap;
import java.util.Map;

public class IterateOverMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Mango");
        map.put(2, "Banana");
        map.put(3, "Apple");
        map.put(4, "Cherry");
        map.put(4, "Grapes");

        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println("Index : " + entry.getKey() + " Element : " + entry.getValue());
        }
    }
}