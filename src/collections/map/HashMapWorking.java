package collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapWorking {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Nikhil");
        map.put(2, "Nitin");
        map.put(3, "Aakash");

        for (Map.Entry<Integer, String > entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}