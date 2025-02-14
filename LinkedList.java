import javax.management.ConstructorParameters;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(39);
        linkedList.add(5);
        linkedList.add(40);
        linkedList.add(65);
        System.out.println(linkedList);
        System.out.println(linkedList.get(3));
        linkedList.addLast(89);
        linkedList.addFirst(77);
        System.out.println(linkedList);
        linkedList.removeIf(x -> x % 2 == 0);
        System.out.println(linkedList);

        LinkedList<String> animal = new LinkedList<>(Arrays.asList("dog", "cat", "you"));
        LinkedList<String> animalIsToRemove = new LinkedList<>(Arrays.asList("dog", "lion"));

        animal.removeAll(animalIsToRemove);
        System.out.println(animal);
    }
}
