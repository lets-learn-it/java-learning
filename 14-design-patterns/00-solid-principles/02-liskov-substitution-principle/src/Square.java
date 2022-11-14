public class Square extends Rectangle {

  public Square(int size) {
    // because both height & width should be same
    super(size, size);
  }

  @Override
  public void setHeight(int height) {
    super.setHeight(height);
    super.setWidth(height);
  }

  @Override
  public void setWidth(int width) {
    super.setWidth(width);
    super.setHeight(width);
  }  
}
