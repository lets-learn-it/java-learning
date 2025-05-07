import java.util.Arrays;
import java.util.HashSet;

public class HashSetDemo {
  public static void main(String[] args) {
    // creation
    HashSet<Integer> hs1 = new HashSet<>(); // create empty
    HashSet<Integer> hs2 = new HashSet<>(100); // initial capacity & default load factor 0.75
    HashSet<Integer> hs3 = new HashSet<>(100, (float) 0.7);
    HashSet<Integer> hs4 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 9, 9));

    // insert
    hs1.add(22);
    hs1.add(24);
    hs1.add(22);
    System.out.println("hs1: " + hs1);
    System.out.println("hs4: " + hs4);

    // remove element
    hs4.remove(5);
    System.out.println("hs4: " + hs4);

    // check if element present
    System.out.println("22 present in hs1: " + hs1.contains(22));
    System.out.println("26 present in hs1: " + hs1.contains(26));

    // check size
    System.out.printf("hs1: len(%d)\n", hs1.size());
    System.out.printf("hs2: len(%d)\n", hs2.size());
    System.out.printf("hs3: len(%d)\n", hs3.size());
    System.out.printf("hs4: len(%d)\n", hs4.size());

    // clear
    hs4.clear();
    System.out.printf("hs4 after clear: len(%d)\n", hs4.size());

    // iterate
    for (Integer ele : hs1) {
      System.out.printf("%d ", ele);
    }
  }
}
