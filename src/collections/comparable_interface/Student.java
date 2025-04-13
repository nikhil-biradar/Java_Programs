package collections.comparable_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {
    String name;
    int rollNo;
    int age;

    public Student(String name, int rollNo, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    @Override
    public int compareTo(Student st) {

//        return this.age - st.age;
//        return this.rollNo - st.rollNo;
        return this.name.compareTo(st.name);
    }

    public static void main(String[] args) {
        Student st1 = new Student("Rajat", 175, 23);
        Student st2 = new Student("Nitin", 125, 25);
        Student st3 = new Student("Vikas", 150, 20);
        Student st4 = new Student("Pawan", 101, 31);

        List<Student> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);

        System.out.println("Displaying Students name by age : ");
        Collections.sort(list);

        for (Student str : list){
            System.out.println("Name: " + str.name + "  RollNo: " + str.rollNo + "  Age: " + str.age);
        }
    }
}