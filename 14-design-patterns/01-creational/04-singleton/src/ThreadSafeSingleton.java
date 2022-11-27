
/**********************************************************************
 * If we have two threads, and both of them call the getInstance() method,
 * it is possible that two individual objects of the same class get created,
 * due to different times of accessing the (instance==null) check.
 **********************************************************************/

public class ThreadSafeSingleton {
  private int value = 0;

  private ThreadSafeSingleton() {

  }
  
  // lazy initialization 
  private static ThreadSafeSingleton INSTANCE = null;

  // add synchronized for thread safety
  synchronized public static ThreadSafeSingleton getInstance2() {
    if(INSTANCE == null) {
      INSTANCE = new ThreadSafeSingleton();
    }
    return INSTANCE;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  // to defeat serialization & deserialization
  protected Object readResolve() {
    return INSTANCE;
  }
}
