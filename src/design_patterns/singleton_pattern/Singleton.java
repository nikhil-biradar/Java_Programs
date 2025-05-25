package design_patterns.singleton_pattern;

public class Singleton {

    private static Singleton instance;

    private Singleton(){
        if(instance != null){
            throw new IllegalStateException("Instance is already Created");
        }
    }

    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Singleton singleton = new Singleton();
        Singleton singleton1 = new Singleton();
//        Singleton singleton2 = (Singleton) singleton1.clone();

    }
}

