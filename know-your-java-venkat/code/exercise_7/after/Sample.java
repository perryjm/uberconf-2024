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

//NullPointerException
//The constructor of Base is first called, before the body of Derived constructor is run.
//The Base's constructor calls check() and that runs the check in Derived before value is
//assigned.

//Do not call virtual functions from within constructors. Even better, don't do anything 
//significant from the constructor.

