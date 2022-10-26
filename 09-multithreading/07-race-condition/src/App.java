public class App {
  public static void main(String[] args) throws Exception {
    Inventory inventory = new Inventory();

    Thread increment = new Thread(new Increment(inventory));
    Thread decrement = new Thread(new Decrement(inventory));

    increment.start();
    decrement.start();

    increment.join();
    decrement.join();

    System.out.println("Inventory: " + inventory.getItems());
  }
}
