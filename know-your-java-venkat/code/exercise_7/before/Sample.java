import java.util.*;

class Base {
  public Base() { check(); }

  public void check() {}
}

class Derived extends Base {
  private String value;

  public Derived(String value) { this.value = value; }

  public void check() {
    if(value.length() == 0) { throw new RuntimeException("value given is empty"); }
  }
}

public class Sample {
  public static void main(String[] args) {
    try {
      new Derived("");
    } catch(Exception ex) {
      System.out.println(ex);
    }
  }
}

