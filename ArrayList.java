import java.util.*;

public class Main {
    public static void main(String[] args) {


        List<Integer> arrayList = new ArrayList<>();
        System.out.println(arrayList.getClass().getName());

        final List<Integer> list1 = Arrays.asList(1, 3, 4);
        System.out.println(list1.getClass().getName());

        String[] array = {"king", "ding", "sing"};
        final List<String> list2 = Arrays.asList(array);
        System.out.println(list2.getClass().getName());

        List<String> list4 = new ArrayList<>(list2);
        list4.add("anything");
        System.out.println(list4);

        final List list3 = List.of(1, 3, 4);

        List<Integer> list5 = new ArrayList<>();
        list5.add(100);
        list5.add(200);
        list5.add(300);

        Collections.sort(list5);

        List<Integer> list6 = List.of(10, 20, 30, 40, 50, 60);
        list5.addAll(list6);
        System.out.println(list5);

//        arrayList.add(10);
//        arrayList.add(20);
//        arrayList.add(30);
//        arrayList.add(2,50);
//        arrayList.set(3,25);
//        System.out.println(arrayList.get(0));
//        System.out.println(arrayList.size());
//
//        System.out.println(arrayList);

//        for(int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }

//        for(int x : arrayList) {
//            System.out.println(x);
//        }

        System.out.println(arrayList.contains(5));
        System.out.println(arrayList.contains(20));

    }
}
