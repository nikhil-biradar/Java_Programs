package java8.static_methods;

public interface A {
    static void showName(){
        System.out.println("This is showName method.");
    }

    static void showName(int a){
        System.out.println("This is show method with int argument.");
    }

     /*public static void main(String[] args) {
        A.showName();
        A.showName(101);
    }*/
}

class B implements A {
    public static void main(String[] args) {
        A.showName();
        A.showName(102);
    }
}