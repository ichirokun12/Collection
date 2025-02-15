import javax.management.ConstructorParameters;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(4,2);
        vector.add(10);
        vector.add(30);
        vector.add(50);
        vector.add(44);
        System.out.println(vector.capacity());
        vector.add(1);
        System.out.println(vector.capacity());
        vector.add(22);
        vector.add(45);
        System.out.println(vector.capacity());
        System.out.println(vector);

        Vector<Integer> vector1 = new Vector<>(Arrays.asList(1, 3, 4));
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(22);
        linkedList.add(6);
        Vector<Integer> vector2 = new Vector<>(linkedList);

        ArrayList<Integer> arrayList = new ArrayList<>();
        Thread t1 = new Thread(
                () -> {
                    for (int i = 0; i < 1000; i++ ) {
                        arrayList.add(i);
                    }
                }
        );

        Thread t2 = new Thread(
                () -> {
                    for (int i = 0; i < 1000; i++) {
                        arrayList.add(i);
                    }
                }
        );

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {

        }
        System.out.println(" suze of arraylist " + arrayList.size());

//        vector
        Vector<Integer> vec = new Vector<>();
        Thread t3 = new Thread(
                () -> {
                    for (int i = 0; i < 1000; i++) {
                        vec.add(i);
                    }
                }
        );

        Thread t4 = new Thread(
                () -> {
                    for (int i = 0; i < 1000; i++) {
                        vec.add(i);
                    }
                }
        );

        t3.start();
        t4.start();

        try {
            t3.join();
            t4.join();
        } catch (InterruptedException e) {

        }
        System.out.println("size of vector " + vec.size());
    }
}
