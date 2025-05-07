import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
  public static void main(String[] args) {
    // creation
    HashMap<Integer, Integer> hm1 = new HashMap<>(); // create empty
    HashMap<Integer, Integer> hm2 = new HashMap<>(100); // initial cap & default load factor 0.75
    HashMap<Integer, Integer> hm3 = new HashMap<>(100, (float) 0.7);

    // insert
    hm1.put(22, 34);
    hm1.put(24, 26);
    hm1.put(22, 56);
    hm2.put(23, 90);
    hm2.putIfAbsent(23, 100);
    System.out.println("hm1: " + hm1);
    System.out.println("hm2: " + hm2);
    System.out.println("hm3: " + hm3);

    // get
    System.out.println("hm1[22]: " + hm1.get(22)); // returns null if not present
    System.out.println("hm1[29]: " + hm1.getOrDefault(29, 0));

    // remove element
    hm3.remove(5);
    System.out.println("hm3: " + hm3);

    // check if key or value present
    System.out.println("22 key present in hm1: " + hm1.containsKey(22));
    System.out.println("26 value present in hm1: " + hm1.containsValue(26));

    // check size
    System.out.printf("hm1: len(%d)\n", hm1.size());
    System.out.printf("hm3: len(%d)\n", hm3.size());

    // clear
    hm3.clear();
    System.out.printf("hm3 after clear: len(%d)\n", hm3.size());

    // iterate
    for (Map.Entry<Integer, Integer> kv : hm1.entrySet()) {
      System.out.printf("(%d, %d) ", kv.getKey(), kv.getValue());
    }

    // get all keys
    Set<Integer> keys = hm1.keySet();
    System.out.println(keys);

    // get all values
    Collection<Integer> values = hm1.values();
    System.out.println(values);
  }
}
