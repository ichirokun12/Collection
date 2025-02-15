import javax.management.ConstructorParameters;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack);
        System.out.println(stack.peek());
        Integer popElement = stack.pop();
        System.out.println(popElement);
        System.out.println(stack);
        System.out.println(stack.peek());

//        Linkedlist as stack
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addLast(10);
        linkedList.addLast(30);
        linkedList.addLast(60);
        linkedList.addLast(100);
        System.out.println(linkedList);
        linkedList.removeLast();
        System.out.println(linkedList);
        System.out.println(linkedList.getLast());

//        ArrayList as stack
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(87);
        arrayList.add(65);
        arrayList.add(12);
        System.out.println(arrayList);
        System.out.println( arrayList.get(arrayList.size() - 1));
        Integer removedElement = arrayList.remove(arrayList.size() - 1);
        System.out.println(removedElement);
        System.out.println(arrayList);
    }
}
