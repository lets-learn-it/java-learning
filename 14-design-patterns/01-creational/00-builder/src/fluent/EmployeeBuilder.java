package fluent;

public class EmployeeBuilder extends PersonBuilder<EmployeeBuilder> {
  public EmployeeBuilder atPosition(String position) {
    this.person.position = position;
    return self();
  }

  @Override
  protected EmployeeBuilder self() {
    return this;
  }
}
