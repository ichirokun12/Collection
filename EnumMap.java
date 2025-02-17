import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class EnumMapDemo {
    public static void main(String[] args) {
        Map<Day, String> map = new EnumMap<>(Day.class);
        map.put(Day.FRIDAY, "fun");
        map.put(Day.MONDAY, "java");
        System.out.println(Day.THURSDAY.ordinal());
        System.out.println(map);
    }
}

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}
