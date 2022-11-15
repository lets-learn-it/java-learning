import factoryclass.Point2;
import factorymethod.Point1;

public class App {
  public static void main(String[] args) throws Exception {
    /* 
     * Using Factory Method
     */
    Point1 point1 = Point1.newCartesianPoint(2,4);
    Point1 point2 = Point1.newPolarPoint(2, 3.14);

    System.out.println(point1);
    System.out.println(point2);

    /* 
     * Using Factory Class
     */
    Point2 point3 = Point2.PointFactory.newCartesianPoint(2,4);
    System.out.println(point3);
  }
}
