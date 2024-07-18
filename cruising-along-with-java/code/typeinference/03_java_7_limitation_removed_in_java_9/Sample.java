import java.util.*;

public class Sample {
  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>() { //This was not possible in Java 7 or Java 8. But, this limitation was removed in Java 9
      {
        add(1);
        add(2);
      }
    };

    System.out.println(numbers.size());
  }
}

