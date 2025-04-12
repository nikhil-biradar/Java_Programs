package methods;

public class MethodChainE2 {

    MethodChainE2 show(){
        System.out.println("Show Method");
        return this;
    }

    MethodChainE2 display(){
        System.out.println("Display Method");
        return this;
    }

    public static void main(String[] args) {
        MethodChainE2 e = new MethodChainE2();
        e.show().display();
    }
}