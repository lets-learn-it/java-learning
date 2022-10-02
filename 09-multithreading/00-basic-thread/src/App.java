

public class App {
  public static void main(String[] args) throws InterruptedException{
    Thread thread = new Thread(new Runnable() {

      @Override
      public void run() {
        System.out.println("We are now in thread: " + Thread.currentThread().getName());
        System.out.println("Thread Priority: " + Thread.currentThread().getPriority());

        throw new RuntimeException("Error Occured");
      }

    });

    thread.setName("worker thread");

    thread.setPriority(Thread.MAX_PRIORITY);

    // if unchecked exception happens in thread then handle it
    thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {

      @Override
      public void uncaughtException(Thread t, Throwable e) {
        System.out.println("Error occured" + t.getName() +
                            " the error is: " + e.getMessage());
        
      }
      
    });

    System.out.println("We are in Thread: " + Thread.currentThread().getName() + 
                        " before starting new thread");

    thread.start();

    Thread.sleep(100);

    System.out.println("We are in Thread: " + Thread.currentThread().getName() + 
                        " after starting new thread");
    
    // sleep tell OS not to schedule this thread
    // there is no overhead for sleep
    Thread.sleep(1000);
  }
}