import java.util.Random;

/* 
 * Train intersection
 * two tracks crossing each other. If trainA wants to use roadA then it has to reserve roadA first
 * Then trainA has to stop traffic on roadB because of crossing.
 * TrainB will do same thing but in opposite direction.
 * TrainA : reserve roadA then lock roadB
 * TrainB : reserve roadB then lock roadA
 * 
 * Deadlock: what if both trains reserve their tracks and then try to lock other road but that road 
 * reserved by other train already.
 */
public class App {
  public static void main(String[] args) throws Exception {
    Intersection intersection = new Intersection();

    Thread trainAThread = new Thread(new TrainA(intersection));
    Thread trainBThread = new Thread(new TrainB(intersection));

    trainAThread.start();
    trainBThread.start();
  }

  public static class TrainA implements Runnable {
    private Intersection intersection;
    private Random random = new Random();

    public TrainA(Intersection intersection) {
      this.intersection = intersection;
    }

    @Override
    public void run() {
      while(true) {
        long sleepingTime = random.nextInt(5);
        try {
          Thread.sleep(sleepingTime);
        } catch (InterruptedException e) {

        }

        intersection.takeRoadA();
      }
    }
  }

  public static class TrainB implements Runnable {
    private Intersection intersection;
    private Random random = new Random();

    public TrainB(Intersection intersection) {
      this.intersection = intersection;
    }

    @Override
    public void run() {
      while(true) {
        long sleepingTime = random.nextInt(5);
        try {
          Thread.sleep(sleepingTime);
        } catch (InterruptedException e) {

        }

        intersection.takeRoadB();
      }
    }
  }

  public static class Intersection {
    private Object roadA = new Object();
    private Object roadB = new Object();

    public void takeRoadA() {
      synchronized(roadA) {
        System.out.println("Reserved roadA by thread: " + Thread.currentThread().getName());

        synchronized(roadB) {
          System.out.println("Locked roadB. TrainA Passing...");

          try {
            Thread.sleep(1);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }

          System.out.println("TrainA passed...");
        }
      }
      System.out.println();
    }

    public void takeRoadB() {
      synchronized(roadB) {
        System.out.println("Reserved roadB by thread: " + Thread.currentThread().getName());

        synchronized(roadA) {
          System.out.println("Locked roadA. TrainB Passing...");

          try {
            Thread.sleep(1);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }

          System.out.println("TrainB passed...");
        }
      }
      System.out.println();
    }
  }
}
