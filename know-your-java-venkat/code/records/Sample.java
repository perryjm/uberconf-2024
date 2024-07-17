import java.util.*;

record Year(int year) {
    Year {
        if(year < 0) {
            throw new RuntimeException("year should not be negative");
        }

        if(year < 100) {
            //this.year = 200 + year;
            year = 200 + year;
            // ERROR: cannot assign a value to final variable year
        }
        // compact constructor is really not a constructor.
    }
}

public class Sample {
    public static void main(String[] args) {
        System.out.println(new Year(2023));
        System.out.println(new Year(1993));
        System.out.println(new Year(23));
    }
}
