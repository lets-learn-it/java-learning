package NonISP;

import exceptions.NotImplemented;

public interface Machine {
  void print();
  void scan() throws NotImplemented;
  void fax() throws NotImplemented;
}
