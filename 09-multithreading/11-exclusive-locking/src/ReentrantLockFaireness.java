import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* 
 * ReentrantLock blocking
 */
public class ReentrantLockFaireness implements Inventory{
  private int items;
  Lock lock;
  long incrementLockBlockTime, decrementLockBlockTime;

  public ReentrantLockFaireness() {
    this.lock = new ReentrantLock(true);
    this.incrementLockBlockTime = 0;
    this.decrementLockBlockTime = 0;
  }
  
  @Override
  public void increment() {
    long startTime = System.currentTimeMillis();

    this.lock.lock();  // block until lock is aquired

    long endTime = System.currentTimeMillis();
    if (endTime - startTime > this.incrementLockBlockTime)
      this.incrementLockBlockTime = endTime - startTime;

    try {
      items ++;
      Thread.sleep(1);
    } catch (InterruptedException e) {
      e.printStackTrace();
    } finally {
      // try region is successful or unsuccessful
      // lock will be released
      this.lock.unlock();
    }
  }

  @Override
  public void decrement() {
    long startTime = System.currentTimeMillis();

    this.lock.lock();  // block until lock is aquired

    long endTime = System.currentTimeMillis();
    if (endTime - startTime > this.incrementLockBlockTime)
      this.incrementLockBlockTime = endTime - startTime;

    try {
      items --;
      Thread.sleep(1);
    } catch (InterruptedException e) {
      e.printStackTrace();
    } finally {
      // try region is successful or unsuccessful
      // lock will be released
      this.lock.unlock();
    }
  }

  @Override
  public int getItems() {
    return this.items;
  }

  @Override
  public void printFairnessReport() {
    System.out.println("Max wait Increment: " + this.incrementLockBlockTime + "\tDecrement: " + this.decrementLockBlockTime);
  }
}
