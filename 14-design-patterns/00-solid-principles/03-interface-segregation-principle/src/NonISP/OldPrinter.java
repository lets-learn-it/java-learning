package NonISP;

/* 
 * This old printer supports only printing
 * but due to machine interface has scan and fax methods, we have to implement them
 * this is violation of ISP
 */
public class OldPrinter implements Machine{

  @Override
  public void print() {
    System.out.println("Printing...");    
  }

  @Override
  public void scan() {
    System.out.println("Dont support...");
  }

  @Override
  public void fax() {
    System.out.println("Dont support...");    
  }
  
}
