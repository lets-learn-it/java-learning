
public class App {
  public static void main(String[] args) throws Exception {
    // Inventory inventory = new ReentrantLockBlocking();
    // Inventory inventory = new ReentrantLockNonBlocking();
    Inventory inventory = new ReentrantLockFaireness();

    Thread decrement = new Thread(new Decrement(inventory));
    Thread increment = new Thread(new Increment(inventory));

    increment.start();
    decrement.start();

    increment.join();
    decrement.join();

    System.out.println("Inventory: " + inventory.getItems());
    
    inventory.printFairnessReport();
  }
}
