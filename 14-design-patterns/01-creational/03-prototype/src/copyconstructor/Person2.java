package copyconstructor;
import java.util.Arrays;

public class Person2 {
  public String []names;
  public Address2 address;

  public Person2(String []names, Address2 address) {
    this.names = names;
    this.address = address;
  }

  // copy constructor
  public Person2(Person2 other) {
    this(other.names.clone(), new Address2(other.address));
  }

  @Override
  public String toString() {
    return "Person [names=" + Arrays.toString(names) + ", address=" + address + "]";
  }
 
}
