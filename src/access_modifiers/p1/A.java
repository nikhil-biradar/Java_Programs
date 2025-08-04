package access_modifiers.p1;


public class A {

    void defaultMethod(){
        System.out.println("This is Defaut method.");
    }

    private void ajit(){
        System.out.println("Ajit Birajdar");
    }

    protected void show(){
        System.out.println("Protected method in class A");
    }

    public void display(){
        System.out.println("Public Access Modifier");
    }
}

class PrivateMethodNotAllowed {
    public static void main(String[] args) {
        A a = new A();
        a.show();
        a.display();
        a.show();
        a.defaultMethod();
//        a.ajit();
    }
}