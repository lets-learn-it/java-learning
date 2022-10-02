public class App {
    public static void main(String[] args) throws Exception {
        NewThread newThread = new NewThread();

        newThread.setName("Worker Thread");

        System.out.println("Before starting worker. In thread: " + Thread.currentThread().getName());
        
        newThread.start();

        Thread.sleep(100);

        System.out.println("After starting worker. In thread: " + Thread.currentThread().getName());

        
    }

    private static class NewThread extends Thread {
      @Override
      public void run() {
        System.out.println("Thread name: " + this.getName());
      }
    }
}
