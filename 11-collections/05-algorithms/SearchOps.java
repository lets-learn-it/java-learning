import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SearchOps {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 5, 77, 3, 2, 12));
    List<Integer> listSorted = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 77, 302, 2442));

    // find frequence of element
    System.out.println("frequence of 5 in list: " + Collections.frequency(list, 5));

    // Check if 2 collections has any common elements
    System.out.println("disjoint : " + Collections.disjoint(list, List.of(1, 78, 56, 44)));
    System.out.println("disjoint : " + Collections.disjoint(list, List.of(100, 78, 56, 44)));

    // finding min max
    System.out.println("Max from list: " + Collections.max(list));
    System.out.println("Min from list: " + Collections.min(list));

    // filter out elements
    List<Integer> evens = list.stream().filter((a) -> {
      return a % 2 == 0;
    }).collect(Collectors.toList());
    System.out.println("evens: " + evens);

    // remove if condition true
    list.removeIf((a) -> {
      return a % 2 == 0;
    });
    System.out.println("list: " + list);
  }
}
