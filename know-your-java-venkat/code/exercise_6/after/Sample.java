import java.util.*;

public class Sample {
  public static void main(String[] args) {
    List.of(1, 2, 3).stream()
      .parallel()
      .map(number -> transform(number))
      .sequential()
      .forEach(number -> print(number));
  }

  public static int transform(int number) {
    System.out.println("transform: " + Thread.currentThread());
    return number * 2;
  }

  public static void print(int number) {
    System.out.println("print: " + Thread.currentThread());
    System.out.println(number);
  }
}

//code may run in main thread or common pool thread (multithreaded)

//What threads do transform and print run in?
//transform: main 
//print: main

//The last call to parallel or sequential sets the threading model for the entire pipeline.

