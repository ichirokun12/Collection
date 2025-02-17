import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOmWriteArraySetDemo {
    public static void main(String[] args) {
//        Thread safe
//        copy on write Mechanism
//        mo duplicate array
//        Iterator do not reflect modification
        CopyOnWriteArraySet<Integer> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        ConcurrentSkipListSet<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>();

        for (int i = 1; i <= 5; i++) {
            copyOnWriteArraySet.add(i);
            concurrentSkipListSet.add(i);

        }
        System.out.println(copyOnWriteArraySet);
        System.out.println(concurrentSkipListSet);

        System.out.println("iterating and modifying copyOnWriteArray");
        for(Integer num : copyOnWriteArraySet) {
            System.out.println("reading from copyOnWriteArraySet " + num);
            copyOnWriteArraySet.add(6);
        }

        System.out.println("iterating and modifying concurrentSkipListSet");
        for(Integer num : concurrentSkipListSet) {
            System.out.println("reading from copyOnWriteArraySet " + num);
            concurrentSkipListSet.add(6);
        }
    }
}
