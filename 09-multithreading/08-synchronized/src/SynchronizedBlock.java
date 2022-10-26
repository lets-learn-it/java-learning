
/* 
 * Synchronized block
 */
public class SynchronizedBlock implements Inventory{
  private int items;
  Object lock;

  public SynchronizedBlock() {
    this.lock = new Object();
  }
  
  @Override
  public void increment() {
    synchronized(this.lock) {
      items ++;
    }
  }

  @Override
  public void decrement() {
    synchronized(this.lock) {
      items --;
    }
  }

  @Override
  public int getItems() {
    return this.items;
  }
}
