package serializable;

import java.io.Serializable;

public class Address3 implements Serializable {
  public String streetName;
  public int houseNumber;
  
  public Address3(String streetName, int houseNumber) {
    this.streetName = streetName;
    this.houseNumber = houseNumber;
  }

  @Override
  public String toString() {
    return "Address [streetName=" + streetName + ", houseNumber=" + houseNumber + "]";
  }
}
