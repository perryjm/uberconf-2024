import java.util.*;

public class Sample {
  public static String process(Object input) {
    if(input instanceof Integer) {
      return "Got a number";
    }

    /*
    if (input instanceof String) {
      return "Got a string of length " + ((String) input).length();
      //They call it casting, I call it punishment

      //Do you work for the compiler or does the compiler work for you?
    }
    */

    if (input instanceof String str) {
      return "Got a string of length " + str.length(); 
    }

    return "whatever";
  }

  public static void main(String[] args) {
    System.out.println(process(1));
    System.out.println(process("hello"));
  }
}

