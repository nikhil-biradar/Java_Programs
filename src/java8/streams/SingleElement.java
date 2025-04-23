package java8.streams;

import collections.comparable_interface.Student;

import java.util.stream.Stream;

public class SingleElement {
    public static void main(String[] args) {
        Stream<Student> singleElement = Stream.of(new Student("Nikhil", 101, 20));
        System.out.println("Count : " + singleElement.count());
    }
}
