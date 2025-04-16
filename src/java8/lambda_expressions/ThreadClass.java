package java8.lambda_expressions;

public class ThreadClass implements Runnable {
    @Override
    public void run() {
        for(int i=0; i<=10; i++){
            System.out.println("Hello " + i);
        }
    }

    public static void main(String[] args) {
        ThreadClass t = new ThreadClass();
        Thread t1 = new Thread(t);
        t1.start();
    }
}