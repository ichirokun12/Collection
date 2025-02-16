import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeAndEqualsMethod {
    public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<>();

        Person p1 = new Person("rajat", 12);
        Person p2 = new Person("alice", 10);
        Person p3 = new Person("bob", 11);
        Person p4 = new Person("rajat", 12);

        map.put(p1,"Engineer"); // hashcode1 --> index1
        map.put(p2, "Designer");// hashcode2 --> index2
        map.put(p3, "Manager");// hashcode3 --> index3
        map.put(p4,"DevOps");// hashcode4 --> index4

        System.out.println("HashMap size" + map.size());
        System.out.println("value of p1 " + map.get(p1));
        System.out.println("value of p2 " + map.get(p4));

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Shubham", 90);// hashcode1 --> index1
        map1.put("deep", 69);// hashcode2 --> index2
        map1.put("Shubham", 99);// hashcode1 --> index1 --> equals() -->replace

        System.out.println(p1);
    }
}

class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return " id " + id + " name " + name;
    }


    @Override
    public boolean equals(Object obj) {
       if(this == obj) {
           return true;
       }
       if(obj == null) {
           return false;
       }
       if(getClass() != obj.getClass()) {
           return false;
       }
       Person other = (Person) obj;
       return id == other.getId()  && Objects.equals(name, other.getName());
    }
}
