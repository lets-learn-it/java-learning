package NonISP;

import exceptions.NotImplemented;

public class NewPrinter implements Machine {

  @Override
  public void print() {
    System.out.println("Printing...");    
  }

  @Override
  public void scan() throws NotImplemented {
    throw new NotImplemented("Scanning not supported...");
  }

  @Override
  public void fax() throws NotImplemented {
    throw new NotImplemented("Faxing not supported...");
  }
  
}
