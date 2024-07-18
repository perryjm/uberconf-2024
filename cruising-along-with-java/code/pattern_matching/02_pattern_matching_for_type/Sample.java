import java.util.*;

public class Sample {
  public static String process(Object input) {
    return switch(input) {
      case Integer i -> "got a number";
      case Double d -> "got a double";
      case String str -> "got a string of length " + str.length();
    };
  }

  public static void main(String[] args) {
    System.out.println(process(1));
    System.out.println(process("hello"));
    System.out.println(process(3.2));
  }
}

