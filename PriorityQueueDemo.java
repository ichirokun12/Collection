import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
//        part of queue interface
//        sort element on the bases of their natural selection
//        custom comparator for customised ordering
//        does not allow null element
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(50);
        pq.add(2);
        pq.add(4);
        System.out.println(pq.remove());
        System.out.println(pq.peek());

        while(!pq.isEmpty()) {
            System.out.println(pq.remove());
        }
    }
}
