import faceted.builder.Employee;
import faceted.builder.PersonBuilderF;
import fluent.EmployeeBuilder;
import fluent.Person;
import html.HtmlBuilder;

public class App {
  public static void main(String[] args) throws Exception {
    // create html list
    String []words = {"Hello", "World"};

    /* 
     * JDK builder pattern : StringBuilder
     */
    System.out.println("=== Using StringBuilder: ");
    StringBuilder sb = new StringBuilder();
    sb.append("<ul>\n");
    for (String word : words) {
      sb.append(String.format(" <li>%s</li>\n", word));
    }
    sb.append("</ul>");

    System.out.println(sb.toString());

    /* 
     * using HtmlBuilder
     */
    System.out.println("=== Using HtmlBuilder: ");
    HtmlBuilder hb = new HtmlBuilder("ul");
    hb.addChild("li", "First item");
    hb.addChild("li", "second child");

    // can chain due to fluent interface
    hb.addChild("li", "another item")
      .addChild("li", "fluent is cool");

    System.out.println(hb.toString());

    /* 
     * Fluent with PersonBuilder & EmployeeBuilder
     */
    System.out.println("=== Fluent Builder with generics");
    EmployeeBuilder eb = new EmployeeBuilder();
    Person person = eb.withName("Parikshit")
      .atPosition("Software Engineer")  // check personbuilder class
      .build();
    System.out.println(person);

    /* 
     * Faceted Builder
     */
    System.out.println("=== Faceted Builder");
    PersonBuilderF pbf = new PersonBuilderF();
    Employee employee = pbf
      .lives()
        .at("Sanjivani Poulty Farm")
        .in("Kavathe Ekand")
        .withPostcode("416307")
      .works()
        .at("Siemens")
        .asA("Infrastructure Engineer")
        .earning(1200000)
      .build();

    System.out.println(employee);
  }
}
