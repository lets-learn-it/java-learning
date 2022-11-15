package cloning;
import java.util.Arrays;

public class Person1 implements Cloneable{
  public String []names;
  public Address1 address;

  public Person1(String []names, Address1 address) {
    this.names = names;
    this.address = address;
  }

  @Override
  public String toString() {
    return "Person [names=" + Arrays.toString(names) + ", address=" + address + "]";
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    return new Person1(
      this.names.clone(),
      (Address1) address.clone());
  }
  
}
