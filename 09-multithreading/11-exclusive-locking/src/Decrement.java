public class Decrement implements Runnable {

  Inventory inventory;

  public Decrement(Inventory inventory) {
    this.inventory = inventory;
    System.out.println("From Decrement: " + this.inventory);
  }

  @Override
  public void run() {
    for (int i = 0; i < 10000; i++) {
      this.inventory.decrement();
    }
  }

}