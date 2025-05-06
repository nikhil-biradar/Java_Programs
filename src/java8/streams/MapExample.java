package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class MapExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Ethan", 30),
                new Employee("Lily", 25),
                new Employee("Mason", 35)
        );

        List<Object> employeeNames = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());

        System.out.println(employeeNames); // Output: [Ethan, Lily, Mason]
    }
}