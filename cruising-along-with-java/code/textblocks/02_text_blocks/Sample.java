import java.util.*;

public class Sample {
  public static String greet(String city) {
    String message = """
    Hello %s,
    How are you doing?
    It's "great" to be here
    Thanks for coming""";

    return message.formatted(city);
  }

  public static void main(String[] args) {
    System.out.println(greet("St. Louis"));
  }
}

