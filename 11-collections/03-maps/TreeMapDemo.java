import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

record Person(String name, int age) {
}


public class TreeMapDemo {
  public static void main(String[] args) {
    // creation
    TreeMap<Integer, Integer> tm1 = new TreeMap<>(); // create empty

    // Comparator
    // return a negative integer if obj1 < obj2
    // return 0 if both objects are equal
    // return a positive integer if obj1 > obj2
    TreeMap<Person, Integer> tm2 = new TreeMap<>((a, b) -> {
      return a.age() - b.age();
    });

    // insert
    tm1.put(22, 34);
    tm1.put(24, 26);
    tm1.put(22, 56);
    tm1.putIfAbsent(22, 100);
    tm2.put(new Person("Parikshit", 28), 70);
    tm2.put(new Person("Shashikant", 60), 90);
    tm2.put(new Person("Kalpana", 55), 80);
    System.out.println("tm1: " + tm1);
    System.out.println("tm2: " + tm2);

    // get
    System.out.println("tm1[22]: " + tm1.get(22)); // returns null if not present
    System.out.println("tm1[29]: " + tm1.getOrDefault(29, 0));

    // remove element
    tm2.remove(new Person("Parikshit", 28));
    System.out.println("tm2: " + tm2);

    // check if key or value present
    System.out.println("22 key present in tm1: " + tm1.containsKey(22));
    System.out.println("26 value present in tm1: " + tm1.containsValue(26));

    // check size
    System.out.printf("tm1: len(%d)\n", tm1.size());
    System.out.printf("tm2: len(%d)\n", tm2.size());

    // clear
    tm1.clear();
    System.out.printf("tm1 after clear: len(%d)\n", tm1.size());

    // iterate
    for (Map.Entry<Person, Integer> kv : tm2.entrySet()) {
      System.out.printf("((%s, %d), %d) ", kv.getKey().name(), kv.getKey().age(), kv.getValue());
    }
    System.out.println();

    // get all keys
    Set<Person> keys = tm2.keySet();
    System.out.println(keys);

    // get all values
    Collection<Integer> values = tm2.values();
    System.out.println(values);
  }
}
