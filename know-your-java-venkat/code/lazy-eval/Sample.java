import java.util.*;

public class Sample {

  public static boolean checkSize(String name) {
    System.out.println ("CheckSize " + name);
    return name.length() == 5;
  }

  public static String transform(String name) {
    return name.toUpperCase();
  }

  public static void main(String[] args) {
    var names = List.of("Dory", "Gill", "Bruce", "Nemo", "Darla", "Marlin", "Jacques");

    var result = names.stream()
      .filter(Sample::checkSize)
      .map(Sample::transform)
      .findFirst()
      .orElse("");
  
    System.out.println("DONE");
  }
}
