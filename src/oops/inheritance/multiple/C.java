package oops.inheritance.multiple;

interface A {
    static void show(){
        System.out.println("A Interface");
    }
}

interface B {
    static void show(){
        System.out.println("B Interface");
    }
}

public class C implements A, B {
    public static void main(String[] args) {
        C c = new C();
        A.show();
        B.show();
    }
}