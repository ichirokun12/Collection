import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class Producer implements Runnable {

    private BlockingQueue<Integer> queue;

    private int value = 0;

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;


    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Producer produced " + value);
                queue.put(value++);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Producer interrupted ");
            }
        }
    }
}

class Consumer implements Runnable {

    private BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;


    }

    @Override
    public void run() {
        while (true) {
            try {
                Integer value = queue.take();
                System.out.println("Consumer consumes " + value);
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Consumer interrupted ");
            }
        }
    }
}

public class BlockingQueueDemo {
    public static void main(String[] args) {
//        thread safe
//        wait for queue to not be empty/ wait for space
        //
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
        Thread producer = new Thread(new Producer(queue));
        Thread consumer = new Thread(new Consumer(queue));
        producer.start();
        consumer.start();

        BlockingQueue<Integer> queue1 = new LinkedBlockingQueue<>();


    }
}
