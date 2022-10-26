
/* 
 * Synchronized method
 */
public class SynchronizedMethod implements Inventory{
  private int items;
  
  @Override
  public synchronized void increment() {
    items ++;
  }

  @Override
  public synchronized void decrement() {
    items --;
  }

  @Override
  public int getItems() {
    return this.items;
  }
}
