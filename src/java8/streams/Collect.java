package java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Collect {
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

        List<String> firstThree = names.stream().skip(3).collect(Collectors.toList());
        System.out.println(firstThree);

    }
}