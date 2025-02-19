package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {

//        feature introduced in java 8
//        process collection and data in a functional and declarative manner
//        simplify data processing
//        Embrace functional programing
//        improve readability and Maintainability
//        Enable easy parallelism

//        what is stream ?
//        stream is a sequence of elements supporting various operation

//        how to use stram
//        Source, Internal Operation and Terminal Operation

        List<Integer> numbers =  Arrays.asList(1,3,4,5);


//        int count = 0;
//        for(int i : numbers) {
//            if(i % 2 == 0) {
//                count++;
//            }
//        }
//        System.out.println(count);


        System.out.println(numbers.stream().filter(x ->x % 2 == 0).count());

//        how to create list
//        1 from collection
        List<Integer> numbers2 =  Arrays.asList(1,3,4,5);
        Stream<Integer> integerStream = numbers2.stream();

//        2 from arrays
        String[] array = {"a", "b", "c"};
        Stream<String> stringStream = Arrays.stream(array);

//        3 using Stream.of()
         Stream<String> stream = Stream.of("a", "b");

//         4 infinite Stream
         Stream<Integer> generate = Stream.generate(() -> 1);
        List<Integer> iterate = Stream.iterate(1, x -> x + 1).limit(100).collect(Collectors.toList());
        System.out.println(iterate);


    }
}
