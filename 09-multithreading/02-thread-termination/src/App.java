public class App {
    public static void main(String[] args) throws Exception {
        Thread thread1 = new Thread(new InterruptedThread());
        Thread thread2 = new Thread(new InterruptedHandledThread());

        thread1.start();
        thread2.start();

        thread2.interrupt();
        thread1.interrupt();
    }

    private static class InterruptedThread implements Runnable {

      @Override
      public void run() {
        try {
          // sleep throws InterruptedException & someone has to handle it
          Thread.sleep(1000);

          System.out.println("In thread which has sleep...");
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }

    private static class InterruptedHandledThread implements Runnable {

      @Override
      public void run() {
        System.out.println("In thread which has while ...");
        while(true) {
          if(Thread.currentThread().isInterrupted()) {
            return;
          }
        }
      }
    }
}
