package interfaces;

public interface M {
    private void getMessage(){
        System.out.println("Hello! There");
    }

    default void getName(){
        getMessage();
        System.out.println("Hi! My Name is Nikhil");
    }

    static void getSize(){
        System.out.println("Hi! My size is 'M'.");
    }
}

class N implements M {
    public static void main(String[] args) {
        N n = new N();
        n.getName();
        M.getSize();
    }
}