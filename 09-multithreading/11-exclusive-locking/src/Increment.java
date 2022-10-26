public class Increment implements Runnable {

  Inventory inventory;

  public Increment(Inventory inventory) {
    this.inventory = inventory;
    System.out.println("From Increment: " + this.inventory);
  }

  @Override
  public void run() {
    for (int i = 0; i < 10000; i++) {
      this.inventory.increment();
    }
  }

}