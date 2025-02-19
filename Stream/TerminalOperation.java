package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOperation {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 3, 4, 5);

        // 1. collect
        list.stream().skip(1).collect(Collectors.toList());
        list.stream().skip(1).toList();

        // 3. forEach
        list.stream().forEach(x -> System.out.println(x));

        // 4 reduce combine elements to produce a single result
        System.out.println(list.stream().reduce((x,y) -> x + y));

        // 5. count

        // 6. anyWatch, allWatch, noneWatch
       boolean b =  list.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(b);

        boolean b2 = list.stream().allMatch(x -> x % 2 == 0);
        System.out.println(b2);

        boolean b3 = list.stream().noneMatch(x -> x % 2 == 0);
        System.out.println(b3);

        // 7 findFirst findAny
        System.out.println(list.stream().findFirst().get());
        System.out.println(list.stream().findAny().get());

        List<String> names = Arrays.asList("Amit", "Bob", "Chavi", "Dayal", "Eri");
        System.out.println(names.stream().filter(x -> x.length() > 3).toList());

        List<Integer> number = Arrays.asList(1, 3, 4, 5, 6, 7);
        System.out.println(number.stream().map(x -> x * x).toList());

        List<Integer> numbers = Arrays.asList(12,23,4,5,4,67);
        System.out.println(numbers.stream().reduce((x, y) -> x + y).get());


    }
}
