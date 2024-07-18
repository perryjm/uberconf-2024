import java.util.*;

public class Sample {
  public static String grade(int score) {
    String grade = "";

    switch(Math.min(score/10, 10)) {
      case 10:
        grade = "A";
	break;
      case 9:
        grade = "A";
	break;
      case 8:
        grade = "B";
	break;
      case 7:
        grade = "C";
	break;
      case 6:
        grade = "D";
	break;
      default:
        grade = "F";
    }

    return "The grade for %d is %s".formatted(score, grade);
  }

  public static void main(String[] args) {
    List.of(102, 95, 87, 78, 64, 56)
      .forEach(score -> System.out.println(grade(score)));
  }
}

//much better than ifelse
//but error prone, need to put break, also is a statement
//that mutates variables, which also can be a source of error.
