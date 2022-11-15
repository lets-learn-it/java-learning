package faceted.builder;


/* 
 * Why these classes (EmployeeAddressBuilder, EmployeeJobBuilder) has to extend PersonBuilderF?
 * it is because they can get works & lives methods so that while building object
 * we can switch between address to job & viceversa
 */
public class EmployeeAddressBuilder extends PersonBuilderF{
  
  public EmployeeAddressBuilder(Employee employee) {
    this.employee = employee;
  }

  public EmployeeAddressBuilder at(String streetAddress) {
    employee.streetAddress = streetAddress;
    return this;
  }

  public EmployeeAddressBuilder withPostcode(String postcode) {
    employee.postcode = postcode;
    return this;
  }

  public EmployeeAddressBuilder in(String city) {
    employee.city = city;
    return this;
  }
}
