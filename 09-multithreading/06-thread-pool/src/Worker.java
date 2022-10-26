import java.math.BigInteger;

public class Worker extends Thread{
  private long inputNumber;
  private BigInteger result;
  private boolean isFinished;
  private long threadId;

  public Worker(int inputNumber) {
    this.inputNumber = inputNumber;
    this.isFinished = false;
  }

  @Override
  public void run() {
    this.result = factorial(inputNumber);
    this.threadId = Thread.currentThread().getId();
    this.isFinished = true;
  }

  public BigInteger factorial(long n) {
    BigInteger tempResult = BigInteger.ONE;

    for (long i = n; i > 0; i--) {
      tempResult = tempResult.multiply(new BigInteger(Long.toString(i)));
    }
    return tempResult;
  }

  public BigInteger getResult() {
    return this.result;
  }

  public long getThreadId() {
    return this.threadId;
  }

  public boolean isFinished() {
    return this.isFinished;
  }
}
