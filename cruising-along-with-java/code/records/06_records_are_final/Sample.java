import java.util.*;

record Location(double latitude, double longitude) {}

//class FunLocation extends Location {} //ERROR
//Location is final as is.

//records are final

public class Sample {
  public static void main(String[] args) {
    Location location = new Location(123.33, -84.23);

    System.out.println(location);
  }
}

