public class SizeSpecification implements Specification<Product> {

  private Size size;

  public SizeSpecification(Size size) {
    this.size = size;
  }

  @Override
  public boolean isSatisfied(Product item) {
    if(this.size == item.size) return true;
    return false;
  }
  
}
