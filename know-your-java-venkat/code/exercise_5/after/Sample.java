import java.util.*;

public class Sample {
  public static void main(String[] args) {
    int[] factor = new int[] { 2 }; 

    var numbers = List.of(1, 2, 3);

    var stream = numbers.stream()
      .map(number -> number * factor[0]);

    factor[0] = 0;

    stream.forEach(System.out::print);
  }
}

//What is the output of this code?
//000
//123
//I have no clue and want to go home

//This is an example of code we should avoid. In Java, lazy evalalution will result in 000
//Some languages only provide eager evaluation and the result will be 123
//Some languages give us options to choose eager and lazy and the result may be different based on what we choose
//Net result, confusion, especially if you work with multiple languages.

