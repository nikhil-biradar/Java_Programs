package collections.comparable_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee>{
    private String name;
    private String surname;
    private double salary;
    private int age;

    public Employee(String name, String surName, double salary, int age){
        this.name = name;
        this.surname = surName;
        this.salary = salary;
        this.age = age;
    }
    @Override
    public int compareTo(Employee emp) {
//        return this.name.compareTo(emp.name);
//        return this.surname.compareTo(emp.surname);
//        return (int) (this.salary - emp.salary);
        return this.age - emp.age;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Nikhil", "Biradar", 100000, 25);
        Employee emp2 = new Employee("Aakash", "Patil", 90000, 30);
        Employee emp3 = new Employee("Durgesh", "Yadav", 70000, 29);
        Employee emp4 = new Employee("Yogesh", "Singh", 120000, 32);

        List<Employee> emplist = new ArrayList<>();
        emplist.add(emp1);
        emplist.add(emp2);
        emplist.add(emp3);
        emplist.add(emp4);

        Collections.sort(emplist);
        System.out.println("Displaying elements after sorting : ");
        for(Employee emp : emplist){
            System.out.println("Name: " + emp.name + " Surname: " + emp.surname + " Salary: " + emp.salary + " Age: " + emp.age);
        }
    }
}