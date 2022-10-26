import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class App {
  public static void main(String[] args) throws Exception {
    // create pool of 8 threads
    ExecutorService executorService = Executors.newFixedThreadPool(8);
    List<Worker> workers = new ArrayList<>();

    for (int i = 0; i < 100; i++) {
      Worker worker = new Worker(i);
      workers.add(worker);
      executorService.submit(worker);
    }

    // after shutdown, you cant submit more tasks
    executorService.shutdown();

    // wait for all tasks to complete
    executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);

    for (int i = 0; i < 100; i++) {
      if (workers.get(i).isFinished()) {
        System.out.println(i + "! : " + workers.get(i).getResult() 
                          + " (Ran by thread: " + workers.get(i).getThreadId() + ")");
      }
    }
  }
}
