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

/*
javac Sample.java
javap -c Sample.class

...
       4: invokespecial #9                  // Method "<init>":()V
       7: astore_1
       8: aload_1
       9: invokevirtual #10                 // Method f1:()V
      12: aload_1
      13: invokevirtual #13                 // Method f2:()V
...
*/
