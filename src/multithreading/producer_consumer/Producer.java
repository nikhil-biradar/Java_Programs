package multithreading.producer_consumer;

public class Producer extends Thread {
    Company c;

    Producer(Company c){
        this.c = c;
    }

    @Override
    public void run(){
        int i = 1;
        while(i < 10){
            try {
                this.c.produce_item(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}