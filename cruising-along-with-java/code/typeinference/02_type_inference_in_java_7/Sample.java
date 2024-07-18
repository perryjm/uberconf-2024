import java.util.*;

public class Sample {
  public static void main(String[] args) {
    //List<Integer> numbers = new ArrayList<Integer>();
    //Map<String, Integer> map = new HashMap<String, Integer>();

    List<Integer> numbers = new ArrayList<>();
    Map<String, Integer> map = new HashMap<>();
    //We dcan use type inference and not have to say
    //the type details over and over, less noisy, and concise.

    System.out.println(numbers.size());
  }
}

