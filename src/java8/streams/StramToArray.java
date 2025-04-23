package java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StramToArray {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Nikhil");
        names.add("Aditya");
        names.add("Nitin");
        names.add("Akshay");
        names.add("Ashish");
        names.add("Nutan");
        names.add("Sarang");
        names.add("Saniya");

        Object [] arraySteram = names.stream().limit(3).toArray();
        System.out.println(Arrays.toString(arraySteram));
    }
}