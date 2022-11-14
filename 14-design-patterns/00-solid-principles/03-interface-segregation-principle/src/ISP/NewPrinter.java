package ISP;

public class NewPrinter implements Printer, Scanner, Faxer {

  @Override
  public void print() {
    System.out.println("Printing...");    
  }

  @Override
  public void scan() {
    System.out.println("Scanning...");   
  }

  @Override
  public void fax() {
    System.out.println("Faxing...");    
  }
  
}
