import java.util.*;

public class Sample {
  public static void main(String[] args) {
    //Collection<Integer> numbers = new ArrayList<Integer>(List.of(1, 2, 3));
    var numbers = new ArrayList<Integer>(List.of(1, 2, 3));

    System.out.println(numbers); //[1, 2, 3]

    numbers.remove(1);

    System.out.println(numbers); //[1, 3] instead of [2, 3]

    //If we change the Collection<Integer> above to var above, what will be the output?
  }
}

//The type of numbers is inferred as ArrayList<Integer> instead of Collection<Integer>
//Type inference is very nice to use, but use caution when changing existing code.
//Relying on good tests in addition to counting on the compiler is generally a good practice. 

