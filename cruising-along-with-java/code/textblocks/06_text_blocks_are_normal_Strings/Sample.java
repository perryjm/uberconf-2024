import java.util.*;

public class Sample {
  public static String greet(String city) {
    String message = """
    Hello %s,
          How are you doing?   \s
    It's "great" to be here             
    Thanks for coming""";

    return message.formatted(city);
  }

  public static void main(String[] args) {
    System.out.println("------");
    System.out.println(greet("St. Louis").replaceAll(" ", "~"));
    System.out.println("The spaces at the end of lines are gone");
    System.out.println("------");
  }
}

//Text Blocks are a compiler feature. When you compile, the
//text blocks are replaced by the normal Java Strings.
