package ISP;

/* 
 * Only Printer is supported.
 */
public class OldPrinter implements Printer{

  @Override
  public void print() {
    System.out.println("Printing...");    
  }  
}
