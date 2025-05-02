package oops.polymorphism.overloading;

public class Overloading {
    void display(Integer a, boolean b){
        System.out.println("Integer");
    }
    void display(String s, boolean b){
        System.out.println("String");
    }
    public static void main(String[] args) {
        Overloading obj = new Overloading();
//        obj.display(null, true);
    }
}