public class Holder<T> {
  T obj;

  public Holder() {

  }

  public Holder(T obj) {
    this.obj = obj;
  }

  public T getObj() {
    return obj;
  }

  public void setObj(T obj) {
    this.obj = obj;
  }

  @Override
  public String toString() {
    return "Holder [obj=" + obj + "]";
  }
  
}
