
public class BasicSingleton {

  private int value = 0;

  // create private constructor so no one can create copy of it
  // but this private constructor can be defeated using reflection (serialization & deserialization)
  private BasicSingleton() {

  }
  
  /********************************************************************
   * For creating singleton, below one of the way can be used
   * 1. eager initialization
   * 2. lazy initialization
   ********************************************************************/

  // 1. eager initialization (improves runtime performace)
  private static final BasicSingleton INSTANCE1 = new BasicSingleton();

  // 2. lazy initialization 
  private static BasicSingleton INSTANCE2 = null;

  public static BasicSingleton getInstance1() {
    return INSTANCE1;
  }

  public static BasicSingleton getInstance2() {
    if(INSTANCE2 == null) {
      INSTANCE2 = new BasicSingleton();
    }
    return INSTANCE2;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  // to defeat serialization & deserialization
  protected Object readResolve() {
    return INSTANCE1; // which is correct INSTANCE
  }
}
