package factorymethod;

/* 
 * Point can be cartesian or polar
 */
public class Point1 {
  private double x, y;

  private Point1(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public static Point1 newCartesianPoint(double x, double y) {
    return new Point1(x, y);
  }

  public static Point1 newPolarPoint(double rho, double theta) {
    return new Point1(rho * Math.cos(theta), rho * Math.sin(theta));
  }

  @Override
  public String toString() {
    return "Point1 [x=" + x + ", y=" + y + "]";
  }
}
