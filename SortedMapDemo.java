import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String[] args) {
        SortedMap<Integer, String> sortedMap = new TreeMap<>((a,b) -> b - a);
        sortedMap.put(12, "kapil");
        sortedMap.put(14, "lala");
        sortedMap.put(16, "jaat");
        sortedMap.put(18, "yadav ji");

        System.out.println(sortedMap);
        System.out.println(sortedMap.firstKey());
        System.out.println(sortedMap.lastKey());
        System.out.println(sortedMap.headMap(14));
        System.out.println(sortedMap.tailMap(14));
        System.out.println(sortedMap.subMap(18, 14));

    }
}
