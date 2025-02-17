import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(12);
        set.add(1110);
        set.add(20);
        set.add(30);
        set.add(20);
        System.out.println(set);
        System.out.println(set.contains(12));
        System.out.println(set.contains(1));
        System.out.println(set.remove(20));
        set.clear();
        System.out.println(set);
    }
}
