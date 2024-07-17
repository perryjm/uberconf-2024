import java.util.*;

public class Sample {
  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<Integer>(List.of(1, 2, 3));

    System.out.println(numbers); //[1, 2, 3]

    numbers.remove(1);

    System.out.println(numbers); //[1, 3]

    //If we change the List<Integer> above to Collection<Integer> above, what will be the output?
  }
}

