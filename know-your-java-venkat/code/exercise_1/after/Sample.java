import java.util.*;

public class Sample {
  public static void main(String[] args) {
    //List<Integer> numbers = new ArrayList<Integer>(List.of(1, 2, 3));
    Collection<Integer> numbers = new ArrayList<Integer>(List.of(1, 2, 3));

    System.out.println(numbers); //[1, 2, 3]

    numbers.remove(1);

    System.out.println(numbers); //[2, 3] instead of [1, 3]

    //If we change the List<Integer> above to Collection<Integer> above, what will be the output?
  }
}

//Collection's remove takes an Object as parameter.
//List overrides and also overloads that function to take an index.
//If we access the function using a Collection  reference, the value 1 is boxed as an object
//If we access the function using a List  reference, the value 1 is used, as is, as an index.

