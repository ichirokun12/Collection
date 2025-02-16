import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(11, 0.5f,true);
        linkedHashMap.put("apple", 20);
        linkedHashMap.put("orange", 50);
        linkedHashMap.put("guava", 10);

        linkedHashMap.get("apple");

        for(Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
