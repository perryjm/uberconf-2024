import java.util.*;

public class Sample {
  public static void main(String[] args) {
    //List<Integer> numbers = Arrays.asList(1, 2, 3);
    List<Integer> numbers = List.of(1, 2, 3);

    System.out.println(numbers); //[1, 2, 3]

    //What is the output of this code?

    try {
      numbers.add(4);
      System.out.println("added");
    } catch(Exception ex) {
      System.out.println("Unsupported");
    }

    try {
      numbers.set(2, 2);
      System.out.println("set");
    } catch(Exception ex) {
      System.out.println("Unsupported");
    }

    System.out.println(numbers);
  }
}

//Arrays.asList() creates a list that does not permit add, but it is not immutable.
//Safe to use List.of instead.

