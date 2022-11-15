package fluent;

public class Person {
  protected String name, position;

  @Override
  public String toString() {
    return "{ name = " + name + ", position = " + position + " }";
  }
}
