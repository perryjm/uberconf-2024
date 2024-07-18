import java.util.*;

public class Sample {
  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<Integer>();
    numbers.add(1);
    numbers.add(2);

    //numbers.add("hello"); //ERROR

    numbers.<Integer>add(3); //type witness is something we 
    //do not do often, but sometimes the compiler may need some help
    //to figure the type. In this example, the type witness is
    //redundant but in some cases it is needed.

    System.out.println(numbers.size());
  }
}

