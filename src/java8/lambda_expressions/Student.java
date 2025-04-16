package java8.lambda_expressions;

@FunctionalInterface
public interface Student {
    String getName();
}

class School {
    public static void main(String[] args) {
        Student st1 = () -> "Nikhil";
        System.out.println(st1.getName());

        Student st2 = () -> "Nitin";
        System.out.println(st2.getName());

        Student st3 = () -> "Vivek";
        System.out.println(st3.getName());
    }
}