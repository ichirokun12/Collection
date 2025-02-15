import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

        List<String> shoppingList = new CopyOnWriteArrayList<>();

        shoppingList.add("milk");
        shoppingList.add("eggs");
        shoppingList.add("bread");

        for (String item : shoppingList) {
            System.out.println(item);
            if(item.equals("eggs")) {
                shoppingList.add("butter");
                System.out.println("added butter with reading");
            }
        }
        System.out.println("updated shopping list " + shoppingList);
    }
}
