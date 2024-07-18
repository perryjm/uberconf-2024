import java.util.*;

public class Sample {
  public static String greet(String city) {
    String message = "";
    message += "Hello %s\n";
    message += "How are you doing?\n";
    message += "It's \"great\" to be here\n";
    message += "Thanks for coming";

    return message.formatted(city);
  }

  public static void main(String[] args) {
    System.out.println(greet("St. Louis"));
  }
}

//This is the type of code we hide from humanity.

