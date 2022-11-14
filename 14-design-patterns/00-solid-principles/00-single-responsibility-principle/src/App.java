public class App {
  public static void main(String[] args) throws Exception {
    Journal journal = new Journal();

    journal.addEntry("Wake Up");
    journal.addEntry("had a bath");
    journal.addEntry("saw friend");

    journal.removeEntry(1);

    System.out.println(journal);

    Persistence p = new Persistence();
    p.saveToFile(journal, "demo.txt");
  }
}
