import java.util.*;
public class Sample {
    public static String grade(int score) {
        String letterGrade = "";
        switch(Math.min(score/10, 10)) {
            case 9, 10:
                letterGrade = "A";
            case 7, 8:
                letterGrade = "B";
            case 5, 6:
                letterGrade = "C";
            case 3, 4:
                letterGrade = "D";
            default:
                letterGrade = "F";
        }
        return letterGrade;
    }

}
