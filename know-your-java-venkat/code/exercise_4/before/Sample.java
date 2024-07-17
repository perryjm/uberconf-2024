import java.util.*;

//What is wrong with this code?

public class Sample {
  public static void main(String[] args) {
    List<String> names = List.of("Dory", "Gill", "Bruce", "Nemo", "Darla", "Marlin", "Jacques");

    List<String> inUppercase = new ArrayList<>();

    names.stream()
      .map(String::toUpperCase)
      .forEach(name -> inUppercase.add(name));

    System.out.println(names.size());
    System.out.println(inUppercase.size());
  }
}

