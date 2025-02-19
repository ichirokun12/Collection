package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOps {
    public static void main(String[] args) {

//        Intermediate operation transform a stream in to another stream
//        they are lazy, they won't execute until a terminal operation execute

        //1. filter
        List<String> names = Arrays.asList("Abhay", "Aman","Akshit" ,"Abhay","ram", "shyam", "ghanshyam");
        Stream<String> filteredStream = names.stream().filter(x -> x.startsWith("s"));
        long res = names.stream().filter(x -> x.startsWith("A")).count();
        System.out.println(res);

        // 2. map
       Stream<String> upperCase = names.stream().map(String::toUpperCase);

       // 3. sorted
       Stream<String> sortedSteam = names.stream().sorted();
       Stream<String> sortedSteam1 = names.stream().sorted((a,b) -> a.length() - b.length());


//       // 4. distinct
        System.out.println(names.stream().filter(x -> x.startsWith("A")).distinct().count());

        // 5. limit
        System.out.println(names.stream().filter(x -> x.startsWith("A")).limit(10).count());

        // 6. skip
        System.out.println(Stream.iterate(1, x->x+1).skip(10).count());



    }
}
