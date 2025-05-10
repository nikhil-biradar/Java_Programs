package java8.default_methods;

public interface A {
    default void getName(){
        System.out.println("This is getName method in interface A");
    }
}

interface B {
    default void getName(){
        System.out.println("This is setName method in interface B");
    }
}

class C implements A, B {
    public static void main(String[] args) {
        C c = new C();
        c.getName();
    }

    @Override
    public void getName() {
        A.super.getName();
    }
}