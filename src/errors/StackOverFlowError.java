package errors;

public class StackOverFlowError {

    static void m1(){
        System.out.println("m1");
        m2();
    }

    static void m2(){
        System.out.println("M2");
        m1();
    }

    public static void main(String[] args) {
        m1();
    }
}