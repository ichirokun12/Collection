import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(12);
        System.out.println(q);
        System.out.println(q.size());

        System.out.println(q.remove());//throws exception when null
        System.out.println(q.poll());

//        System.out.println(q.element());// throws exception when null
////        System.out.println(q.peek());

        Queue<Integer> queue2 = new ArrayBlockingQueue<>(2);
        System.out.println(queue2.add(2));//true
        System.out.println(queue2.offer(14));//true
        System.out.println(queue2.offer(100));//false
//        System.out.println(queue2.add(5));



    }
}
