package fluent;

/* 
 * What if while using EmployeeBuilder, user uses withName and then atPostion methods
 * because withName returning PersonBuilder & atPosition not available here.
 * 
 * Use Generics
 */
public class PersonBuilder<SELF extends PersonBuilder<SELF>> {
  protected Person person = new Person();

  public SELF withName(String name) {
    person.name = name;
    return self();
  }

  public Person build() {
    return person;
  }

  protected SELF self() {
    return (SELF) this;
  }
}
