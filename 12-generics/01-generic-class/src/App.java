public class App {
  public static void main(String[] args) throws Exception {
    Holder<String> stringHolder = new Holder<String>();

    stringHolder.setObj("Parikshit");
    System.out.println(stringHolder);

    Holder<Integer> integerHolder = new Holder<>(52);

    System.out.println(integerHolder);
  }
}
