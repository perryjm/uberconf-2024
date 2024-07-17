import java.util.*;

public class Sample {
  public void f1() {}
  public final void f2() {}

  public static void main(String[] args) {
    //f1 can be overriden by a derived class of Sample, but f2 can't be.

    //In the bytecode, a call to f1 will be virtual: invokevirtual.
    //What about f2?

    var sample = new Sample();
    sample.f1();
    sample.f2();
  }
}

