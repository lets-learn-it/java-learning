import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Journal {
  private final List<String> entries = new ArrayList<>();
  private static int count = 0;

  public void addEntry(String text) {
    entries.add("" + (++count) + ": " + text);
  }

  public void removeEntry(int index) {
    entries.remove(index);
  }

  @Override
  public String toString() {
    return String.join(System.lineSeparator(), entries);
  }

  /*
   * Violation of SRP move this method to Persistence class
   */
  public void save(String filename) {
    try (PrintStream out = new PrintStream(filename)) {
      out.println(toString());
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
