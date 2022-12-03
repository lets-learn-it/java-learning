import java.util.ArrayList;

public class App {
  public static void main(String[] args) throws Exception {
    ArrayList<String> list = new ArrayList<>();

    list.add("Parikshit1");
    list.add("Umesh");

    String s = list.get(0);
    System.out.println("String from list: " + s);
  }
}
