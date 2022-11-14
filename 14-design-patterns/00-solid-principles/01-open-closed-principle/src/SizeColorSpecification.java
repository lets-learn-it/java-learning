public class SizeColorSpecification implements Specification<Product> {

  private Size size;
  private Color color;

  public SizeColorSpecification(Size size, Color color) {
    this.size = size;
    this.color = color;
  }

  @Override
  public boolean isSatisfied(Product item) {
    if(this.size == item.size && this.color == item.color) return true;
    return false;
  }
  
}
