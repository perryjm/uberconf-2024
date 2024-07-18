import java.util.*;

public class Sample {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3);

    numbers.forEach((Integer e) -> System.out.println(e));
    //You know that the value will be an Integer and the compiler
    //also knows that.

    numbers.forEach(e -> System.out.println(e));
    //we can use the type inference.
  }
}

