package collections.comparable_interface;

public class Student implements Comparable<Student>{
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
        if(age == st.age){
            return 0;
        }else if(age > st.age){
            return 1;
        }else {
            return -1;
        }
    }

}