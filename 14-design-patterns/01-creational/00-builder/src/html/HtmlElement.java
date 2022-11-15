package html;
import java.util.ArrayList;
import java.util.Collections;

public class HtmlElement {
  // <p>Hello</p> p is name & Hello is text
  public String name, text;

  // <ul><li>Hello</li></ul>
  public ArrayList<HtmlElement> elements = new ArrayList<>();

  private final int indentSize = 2;
  private final String newLine = System.lineSeparator();
  
  public HtmlElement() {
  }

  public HtmlElement(String name, String text) {
    this.name = name;
    this.text = text;
  }

  private String toStringImpl(int indent) {
    StringBuilder sb = new StringBuilder();
    String i = String.join("", Collections.nCopies(indent * indentSize, " "));
    sb.append(String.format("%s<%s>%s", i, name, newLine));
    if (text != null && !text.isEmpty()) {
      sb.append(String.join("", Collections.nCopies(indentSize * (indent + 1), " ")))
        .append(text)
        .append(newLine);
    }
    for (HtmlElement element : elements) {
      sb.append(element.toStringImpl(indent + 1));
    }
    sb.append(String.format("%s</%s>%s", i, name, newLine));
    return sb.toString();
  }

  public String toString() {
    return toStringImpl(0);
  }
  
}
