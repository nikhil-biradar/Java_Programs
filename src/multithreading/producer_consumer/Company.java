package multithreading.producer_consumer;

public class Company {
    int n ;
    boolean f = false;

    // f=false: chance: producer
    // f=true: chance: consumer
    synchronized public void produce_item(int n) throws InterruptedException {
        if(f){
            wait();
        }
        this.n = n;
        System.out.println("Produced : " + this.n);
        f = true;
        notify();
    }

    synchronized public int consume_item() throws InterruptedException {
        if(!f){
            wait();
        }
        System.out.println("Consumed : " + this.n);
        f = false;
        notify();
        return this.n;
    }

    public static void main(String[] args) {

    }
}
