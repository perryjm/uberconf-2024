import java.util.*;

public class Sample {
  public static void main(String[] args) {
    var numbers = List.of(1, 2, 3);

    numbers.forEach((final Integer e) -> System.out.println(e));

    //numbers.forEach((final e) -> System.out.println(e)); //ERROR

    numbers.forEach((final var e) -> System.out.println(e));

    //numbers.forEach((@NotNull var e) -> System.out.println(e));
  }
}

