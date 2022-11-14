import java.util.List;
import java.util.stream.Stream;

public class ProductFilterOCP implements Filter<Product> {

  @Override
  public Stream<Product> filter(List<Product> items, Specification<Product> specs) {
    return items.stream().filter(p -> specs.isSatisfied(p));
  }
  
}
