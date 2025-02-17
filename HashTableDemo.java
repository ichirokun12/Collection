import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashTable = new Hashtable<>();
//        hashTable is Synchronized
//        no null key and vale
//        Legacy class replaced by concurrentHashmap
//        slower then hashMap
        hashTable.put(1, "one");
        hashTable.put(2, "two");
        hashTable.put(3, "three");
        System.out.println(hashTable);
        System.out.println("value for kwy 2 :" + hashTable.get(2));
        System.out.println("does key 2 exists " + hashTable.containsKey(2));
        hashTable.remove(2);
        System.out.println(hashTable);

        Hashtable<Integer, String> table = new Hashtable<>();
        Thread thread1 = new Thread(()-> {
            for(int i = 0; i < 1000; i++) {
                table.put(i , "Thread1");
            }
        }
        );

        Thread thread2 = new Thread(
                ()-> {
                    for(int i = 1000; i < 2000; i++) {
                        table.put(i, "Thread2");
                    }
                }
        );

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {

        }
        System.out.println(table.size());
    }
}
