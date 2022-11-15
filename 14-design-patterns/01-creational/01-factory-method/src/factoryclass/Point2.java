package factoryclass;

/* 
 * Factory class also can be created
 * if you want to make constructor private then you need to add class PointFactory in Point class
 */
public class Point2 {
  private double x, y;

  private Point2(double x, double y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public String toString() {
    return "Point2 [x=" + x + ", y=" + y + "]";
  }

  public static class PointFactory {
    public static Point2 newCartesianPoint(double x, double y) {
      return new Point2(x, y);
    }
  
    public static Point2 newPolarPoint(double rho, double theta) {
      return new Point2(rho * Math.cos(theta), rho * Math.sin(theta));
    }
  }
}
