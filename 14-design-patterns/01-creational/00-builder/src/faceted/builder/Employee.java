package faceted.builder;

public class Employee {
  public String streetAddress, postcode, city;

  public String companyName, position;
  public int annualIncome;
  
  @Override
  public String toString() {
    return "Employee [streetAddress=" + streetAddress + ", postcode=" + postcode + ", city=" + city + ", companyName="
        + companyName + ", position=" + position + ", annualIncome=" + annualIncome + "]";
  }
}
