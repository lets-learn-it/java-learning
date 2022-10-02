public class App {
  public static void main(String[] args) throws Exception {
      Thread thread = new Thread(new DaemonThread());

      thread.setDaemon(true);

      thread.start();

      System.out.println("Daemon started...");

      Thread.sleep(1000);

      System.out.println("Main thread exiting...");

      // no need to interrupt daemon
      // thread.interrupt();
  }


  private static class DaemonThread implements Runnable {

    @Override
    public void run() {
      System.out.println("In thread which has while ...");
      while(true) {
        System.out.println("From daemon...");
      }
    }
  }
}
