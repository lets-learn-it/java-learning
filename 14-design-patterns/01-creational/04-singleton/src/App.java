public class App {
  public static void main(String[] args) throws Exception {
    BasicSingleton bs = BasicSingleton.getInstance1();
    // BasicSingleton bs2 = BasicSingleton.getInstance2();

    bs.setValue(10);
    System.out.println("Value from singleton: " + bs.getValue());
  }
}
