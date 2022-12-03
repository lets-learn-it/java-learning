public class App {

  static <T> void print(T obj) {
    System.out.println("Printing from static generic method: " + obj);
  }

  public static void main(String[] args) throws Exception {
    String name = "Parikshit";
    int age = 20;

    print(name);
    print(age);

    Printer printer = new Printer();

    printer.print(name);
    printer.print(age);
  }
}
