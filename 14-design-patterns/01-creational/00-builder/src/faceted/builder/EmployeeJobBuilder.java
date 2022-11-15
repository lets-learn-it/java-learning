package faceted.builder;

/* 
 * Why these classes (EmployeeAddressBuilder, EmployeeJobBuilder) has to extend PersonBuilderF?
 * it is because they can get works & lives methods so that while building object
 * we can switch between address to job & viceversa
 */
public class EmployeeJobBuilder extends PersonBuilderF {
  public EmployeeJobBuilder(Employee employee) {
    this.employee = employee;
  }

  public EmployeeJobBuilder at(String companyName) {
    employee.companyName = companyName;
    return this;
  }

  public EmployeeJobBuilder asA(String position) {
    employee.position = position;
    return this;
  }

  public EmployeeJobBuilder earning(int income) {
    employee.annualIncome = income;
    return this;
  }
}
