import java.util.List;

public class App {
  public static void main(String[] args) throws Exception {
    Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
    Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
    Product house = new Product("House", Color.BLUE, Size.MEDIUM);

    ProductFilter filter = new ProductFilter();

    List<Product> products = List.of(apple, tree, house);

    // without OCP
    System.out.println("Green Products (violating OCP): ");
    filter.filterByColor(products, Color.GREEN)
          .forEach(p -> System.out.println(" - " + p.name));
    
    // with OCP
    ColorSpecification colorSpecification = new ColorSpecification(Color.GREEN);
    SizeSpecification sizeSpecification = new SizeSpecification(Size.LARGE);
    SizeColorSpecification sizeColorSpecification = new SizeColorSpecification(Size.MEDIUM, Color.BLUE);
    ProductFilterOCP productFilterOCP = new ProductFilterOCP();

    System.out.println("Green Products : ");
    productFilterOCP.filter(products, colorSpecification)
                    .forEach(p -> System.out.println(" - " + p.name));
    
    System.out.println("blue Products & Medium Size: ");
    productFilterOCP.filter(products, sizeColorSpecification)
                    .forEach(p -> System.out.println(" - " + p.name));
    
    System.out.println("And Specification: ");
    productFilterOCP.filter(products, new AndSpecification(colorSpecification, sizeSpecification))
                    .forEach(p -> System.out.println(" - " + p.name));
  }
}
