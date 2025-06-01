package constructor;

public class ConstructorChainDemo {

    public ConstructorChainDemo(){
        System.out.println("Parent Class Constructor with no arguments");
    }

    public ConstructorChainDemo(int a, int b){
        this();
        System.out.println("Parent Class Constructor with 2 arguments");
    }

    public ConstructorChainDemo(int a, int b, int c){
        this(10, 20);
        System.out.println("Parent Class Constructor with 3 arguments");
    }
}

class ConstructorExample extends ConstructorChainDemo {
    public ConstructorExample(String a, String b){
        super(10, 20, 30);
        System.out.println("Child Class Constructor with 2 arguments");
    }

    public ConstructorExample(int a, long b, float c){
        this("A", "B");
        System.out.println("Child Class Constructor with 3 arguments");
    }

    public static void main(String[] args) {
        ConstructorExample constructorexample = new ConstructorExample(10, 20L, 2.0f);
    }
}