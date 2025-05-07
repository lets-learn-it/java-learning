import java.util.Arrays;
import java.util.TreeSet;

record Person(String name, int age) {
}


public class TreeSetDemo {
  public static void main(String[] args) {
    // creation
    TreeSet<Integer> ts1 = new TreeSet<>(); // create empty, sorted according to natural ordering
    TreeSet<Integer> ts2 = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5, 9, 9));

    // Comparator
    // return a negative integer if obj1 < obj2
    // return 0 if both objects are equal
    // return a positive integer if obj1 > obj2
    TreeSet<Person> ts3 = new TreeSet<>((a, b) -> {
      return a.age() - b.age();
    });

    // insert
    ts1.add(22);
    ts1.add(24);
    ts1.add(22);
    ts2.add(44);
    ts2.add(56);
    ts3.add(new Person("Shashikant", 60));
    ts3.add(new Person("Parikshit", 28));
    ts3.add(new Person("Kalpana", 55));
    System.out.println("ts1: " + ts1);
    System.out.println("ts2: " + ts2);
    System.out.println("ts3: " + ts3);

    // remove element
    ts2.remove(5);
    System.out.println("ts4: " + ts2);

    // check if element present
    System.out.println("22 present in ts1: " + ts1.contains(22));
    System.out.println("26 present in ts1: " + ts1.contains(26));

    // check size
    System.out.printf("ts1: len(%d)\n", ts1.size());
    System.out.printf("ts2: len(%d)\n", ts2.size());
    System.out.printf("ts3: len(%d)\n", ts3.size());

    // clear
    ts2.clear();
    System.out.printf("ts2 after clear: len(%d)\n", ts2.size());

    // iterate
    for (Integer ele : ts1) {
      System.out.printf("%d ", ele);
    }
    System.out.println();

    // sorted output
    for (Person p : ts3) {
      System.out.println(p);
    }
  }
}
