package multithreading.demo;

public class Demo {
    public static void main(String[] args) {
        String s1 = "Java";
        s1 = "Python";
        System.out.println(s1);

        String s2 = new String("Java");
        s2 = new String("Python");
        System.out.println(s2);
    }
}