
/* 
 * Synchronized method
 * When you use synchronized method, whole object will be locked
 * ie. If one thread is inside synchronized method, then any other thread can't access that object
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
