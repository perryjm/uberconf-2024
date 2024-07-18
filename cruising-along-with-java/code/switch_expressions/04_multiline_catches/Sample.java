import java.util.*;

public class Sample {
  public static String grade(int score) {
    final String grade = switch(Math.min(score/10, 10)) {
      case 9, 10 -> "A";
      case 8 -> {
        System.out.println("do some extra work...");
        yield "B";
      }//whereas this is possible, do not write multiline
      //instead call a function that does the multiline.
      case 7 -> "C";
      case 6 -> "D";
      default -> "F";
    };

    return "The grade for %d is %s".formatted(score, grade);
  }

  public static void main(String[] args) {
    List.of(102, 95, 87, 78, 64, 56)
      .forEach(score -> System.out.println(grade(score)));
  }
}

