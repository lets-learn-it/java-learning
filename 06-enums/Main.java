enum Weekday {
  MONDAY("सॊमवार"), TUESDAY("मंगळवार"), WEDNESDAY("बुधवार"), THURSDAY("गुरुवार"), FRIDAY(
      "शुक्रवार"), SATUREDAY("शनिवार"), SUNDAY("रविवार");

  private String marathiName;

  private Weekday(String marathiName) {
    this.marathiName = marathiName;
  }

  public String marathi() {
    return this.marathiName;
  }
}


public class Main {
  public static void main(String[] args) {
    Weekday sday = Weekday.MONDAY;
    System.out.println(sday.marathi());

    for (Weekday day : Weekday.values()) {
      System.out.printf("%d: %s (%s)\n", day.ordinal(), day.name(), day.marathi());
    }
  }
}
