public interface Inventory{
  public void increment();
  public void decrement();

  public int getItems();
  

  /* 
   * Synchronized block
   */
  Object obj = new Object();
  // public synchronized void increment() {
  //   items ++;
  // }

  // public synchronized void decrement() {
  //   items --;
  // }
}

