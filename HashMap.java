import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>(18, 0.5f);
        hashMap.put(1, "Akshit");
        hashMap.put(2, "rajat");
        hashMap.put(3, "shubham");
        System.out.println(hashMap);
        String student = hashMap.get(2);
        System.out.println(student);
        System.out.println(hashMap.get(1));
        System.out.println(hashMap.get(69));
        System.out.println(hashMap.containsKey(5));
        System.out.println(hashMap.containsValue("deep"));
        System.out.println();

        for(int i : hashMap.keySet()) {
            System.out.println(hashMap.get(i));
        }

        Set<Map.Entry<Integer, String>> set = hashMap.entrySet();
        for (Map.Entry<Integer, String>  i : set) {
            System.out.println(i.getKey() + " : " + i.getValue() );
        }

        Set<Map.Entry<Integer, String>> set2 = hashMap.entrySet();
        for (Map.Entry<Integer, String>  i : set2) {
            i.setValue(i.getValue().toUpperCase());
        }
        System.out.println(hashMap);
        hashMap.remove(3);
        System.out.println(hashMap);
    }
}
