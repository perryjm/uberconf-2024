import java.util.*;

public class Sample {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3);

    numbers.forEach((final Integer e) -> System.out.println(e));
    //numbers.forEach((@NotNull Integer e) -> System.out.println(e)); ///OK

    //numbers.forEach((final e) -> System.out.println(e)); //ERROR
    //numbers.forEach((@NotNull e) -> System.out.println(e)); //ERROR
  }
}

