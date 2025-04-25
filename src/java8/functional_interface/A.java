package java8.functional_interface;

@FunctionalInterface
public interface A {
    void show();
}

@FunctionalInterface
interface B extends A {
    @Override
    void show();
}

class C implements A, B {
    public static void main(String[] args) {
        new C().show();
    }

    @Override
    public void show() {
    }
}