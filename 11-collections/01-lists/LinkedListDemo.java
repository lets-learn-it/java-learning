import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {
  public static void main(String[] args) {
    // creation
    LinkedList<Integer> ll1 = new LinkedList<>(); // creates empty array list
    LinkedList<Integer> ll2 = new LinkedList<>(Collections.nCopies(10, 0)); // size 10 with 0

    // check size
    System.out.printf("ll1: len(%d)\n", ll1.size());
    System.out.printf("ll2: len(%d)\n", ll2.size());

    // Insert some elements
    ll1.add(2);
    ll1.add(4);
    ll1.add(2, 5); // as ll1.size() is 2, element can be added index >= 0 && index <= size()
    ll1.addFirst(40);
    ll1.addLast(60);
    System.out.println("ll1: " + ll1);

    ll2.set(0, 10);
    ll2.set(3, 10);
    System.out.println("ll2: " + ll2);

    // remove elements
    ll1.remove(2); // Remove from index
    ll2.remove((Integer) 10); // Removes the first occurrence of the specified element
    ll2.removeLast();
    ll2.removeFirst();
    System.out.println("ll1: " + ll1);
    System.out.println("ll3: " + ll2);
  }
}
