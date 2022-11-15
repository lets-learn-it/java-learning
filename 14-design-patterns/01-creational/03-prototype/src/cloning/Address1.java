package cloning;
public class Address1 implements Cloneable {
  public String streetName;
  public int houseNumber;
  
  public Address1(String streetName, int houseNumber) {
    this.streetName = streetName;
    this.houseNumber = houseNumber;
  }

  @Override
  public String toString() {
    return "Address [streetName=" + streetName + ", houseNumber=" + houseNumber + "]";
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    return new Address1(this.streetName, this.houseNumber);
  }
}
