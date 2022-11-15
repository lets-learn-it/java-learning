package serializable;
import java.io.Serializable;
import java.util.Arrays;

public class Person3 implements Serializable{
  public String []names;
  public Address3 address;

  public Person3(String []names, Address3 address) {
    this.names = names;
    this.address = address;
  }

  @Override
  public String toString() {
    return "Person [names=" + Arrays.toString(names) + ", address=" + address + "]";
  }
 
}
