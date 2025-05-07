import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
  public static void main(String[] args) {
    // creation
    ArrayList<Integer> al1 = new ArrayList<>(); // creates empty array list
    ArrayList<Integer> al2 = new ArrayList<>(10); // specify initial capacity
    ArrayList<Integer> al3 = new ArrayList<>(Collections.nCopies(10, 0)); // size 10 with 0

    // check size
    System.out.printf("al1: len(%d)\n", al1.size());
    System.out.printf("al2: len(%d)\n", al2.size());
    System.out.printf("al3: len(%d)\n", al3.size());

    // Insert some elements
    al1.add(2);
    al1.add(4);
    al1.add(2, 5); // as al1.size() is 2, element can be added index >= 0 && index <= size()
    System.out.println("al1: " + al1);

    al3.set(0, 10);
    al3.set(3, 10);
    System.out.println("al3: " + al3);

    // remove elements
    al1.remove(2); // Remove from index
    al3.remove((Integer) 10); // Removes the first occurrence of the specified element
    System.out.println("al1: " + al1);
    System.out.println("al3: " + al3);
  }
}
