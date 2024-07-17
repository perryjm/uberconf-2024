import java.util.*;

public class Sample {
  public static void main(String[] args) {
    Collection<Integer> numbers = new ArrayList<Integer>(List.of(1, 2, 3));

    System.out.println(numbers); //[1, 2, 3]

    numbers.remove(1);

    System.out.println(numbers); //[2, 3]

    //If we change the Collection<Integer> above to var above, what will be the output?
  }
}

