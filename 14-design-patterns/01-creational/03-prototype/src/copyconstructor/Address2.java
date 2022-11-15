package copyconstructor;
public class Address2 {
  public String streetName;
  public int houseNumber;
  
  public Address2(String streetName, int houseNumber) {
    this.streetName = streetName;
    this.houseNumber = houseNumber;
  }

  // copy constructor
  public Address2(Address2 other) {
    this(other.streetName, other.houseNumber);
  }

  @Override
  public String toString() {
    return "Address [streetName=" + streetName + ", houseNumber=" + houseNumber + "]";
  }
}
