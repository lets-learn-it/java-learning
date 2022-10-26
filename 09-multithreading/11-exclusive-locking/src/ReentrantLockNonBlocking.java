import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* 
 * ReentrantLock non blocking
 */
public class ReentrantLockNonBlocking implements Inventory {
  private int items;
  Lock lock;

  public ReentrantLockNonBlocking() {
    this.lock = new ReentrantLock();
  }
  
  @Override
  public void increment() {
    if (this.lock.tryLock()) {
      try {
        items ++;
      } finally {
        // try region is successful or unsuccessful
        // lock will be released
        this.lock.unlock();
      }
    } else {
      System.out.println("didn't got lock...");
    }
  }

  @Override
  public void decrement() {
    if (this.lock.tryLock()) {
      try {
        items --;
      } finally {
        // try region is successful or unsuccessful
        // lock will be released
        this.lock.unlock();
      }
    } else {
      System.out.println("didn't got lock...");
    }
  }

  @Override
  public int getItems() {
    return this.items;
  }

  @Override
  public void printFairnessReport() {
    System.out.println("Non blocking. No report");
  }
}
