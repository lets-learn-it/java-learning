import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Persistence {
  
  void saveToFile(Journal journal, String filename) {
    try (PrintStream out = new PrintStream(filename)) {
      out.println(journal.toString());
    } catch(FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
