import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueDemo {
    public static void main(String[] args) {
//        double ended queue
//        allow insertion and deletion at both end
        Deque<Integer> deque = new ArrayDeque<>(); // faster iteration, low memory, no null allowed
        deque.add(10);
        deque.addFirst(1);
        deque.addLast(6);
        deque.offerFirst(18);
        deque.offerLast(16);
        System.out.println(deque);
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        deque.removeFirst();
        deque.removeLast();
        deque.pollFirst();
        deque.pollLast();
        System.out.println(deque);

    }
}
