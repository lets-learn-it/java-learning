import java.util.ArrayDeque;
import java.util.List;

public class ArrayDequeDemo {
  public static void main(String[] args) {
    // create
    ArrayDeque<Integer> q1 = new ArrayDeque<>();
    ArrayDeque<Integer> q2 = new ArrayDeque<>(10);
    ArrayDeque<Integer> q3 = new ArrayDeque<>(List.of(1, 2, 3, 4, 6, 7, 8, 5));
    ArrayDeque<Integer> s1 = new ArrayDeque<>();
    ArrayDeque<Integer> s2 = new ArrayDeque<>(10);
    ArrayDeque<Integer> s3 = new ArrayDeque<>(List.of(1, 2, 3, 4, 6, 7, 8, 5));

    // push
    q1.addLast(12);
    q2.addLast(22);
    s1.addLast(23);
    s2.addLast(34);

    // print
    System.out.println("q1: " + q1);
    System.out.println("q2: " + q2);
    System.out.println("q3: " + q3);
    System.out.println("s1: " + s1);
    System.out.println("s2: " + s2);
    System.out.println("s3: " + s3);

    // peek
    System.out.println("q1.peek(): " + q1.getFirst());
    System.out.println("q2.peek(): " + q2.getFirst());
    System.out.println("q3.peek(): " + q3.getFirst());
    System.out.println("s1.peek(): " + s1.getLast());
    System.out.println("s2.peek(): " + s2.getLast());
    System.out.println("s3.peek(): " + s3.getLast());

    // pop
    q3.removeFirst(); // throws exception if empty
    q3.pollFirst(); // null if this deque is empty
    s3.removeLast();
    s3.pollLast();

    // print
    System.out.println("q1: " + q1);
    System.out.println("q2: " + q2);
    System.out.println("q3: " + q3);
    System.out.println("s1: " + s1);
    System.out.println("s2: " + s2);
    System.out.println("s3: " + s3);
  }
}
