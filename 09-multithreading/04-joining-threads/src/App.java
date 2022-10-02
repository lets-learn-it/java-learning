import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
      List<Long> inputNumbers = Arrays.asList(0L, 100L, 45L);

      List<FactorialThread> threads = new ArrayList<>();

      for (long inputNumber : inputNumbers) {
        threads.add(new FactorialThread(inputNumber));
      }

      for (FactorialThread factorialThread : threads) {
        factorialThread.setDaemon(true);
        factorialThread.start();
      }

      for (FactorialThread factorialThread : threads) {
        // factorialThread.join(2000);
        factorialThread.join();
      }

      for (int i=0;i<inputNumbers.size();i++) {
        FactorialThread factorialThread = threads.get(i);
        if(factorialThread.isFinished()) {
          System.out.println(inputNumbers.get(i) + "! = " + factorialThread.getResult());
        } else {
          System.out.println("Not finished yet...");
        }
      }

      
    }

    public static class FactorialThread extends Thread {
      private long inputNumber;
      private BigInteger result = BigInteger.ZERO;
      private boolean isFinished = false;

      public FactorialThread(long inputNumber) {
        this.inputNumber = inputNumber;
      }

      @Override
      public void run() {
        this.result = factorial(inputNumber);
        this.isFinished = true;
      }

      public BigInteger factorial(long n) {
        BigInteger tempResult = BigInteger.ONE;

        for (long i = n; i > 0; i--) {
          tempResult = tempResult.multiply(new BigInteger(Long.toString(i)));
        }
        return tempResult;
      }

      public boolean isFinished() {
        return isFinished;
      }

      public BigInteger getResult() {
        return result;
      }
    }
}
