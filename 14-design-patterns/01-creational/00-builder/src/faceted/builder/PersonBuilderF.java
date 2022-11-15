package faceted.builder;

public class PersonBuilderF {
  protected Employee employee = new Employee();

  public EmployeeAddressBuilder lives() {
    return new EmployeeAddressBuilder(employee);
  }

  public EmployeeJobBuilder works() {
    return new EmployeeJobBuilder(employee);
  }

  public Employee build() {
    return employee;
  }
}
