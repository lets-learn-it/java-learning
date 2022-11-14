public class App {
  public static void main(String[] args) throws Exception {
    Rectangle r = new Rectangle(10, 25);
    Rectangle s = new Square(25);

    useIt(r);

    // violation of LSP
    useIt(s);
  }

  static void useIt(Rectangle r) {
    int width = r.getWidth();
    r.setHeight(10);
    System.out.println("Area from Object = " + r.getHeight() * r.getWidth());
    System.out.println("Area should be = " + r.getHeight() * width);
  }
}
