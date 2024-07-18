import java.util.*;

interface SafePlace {}

record Location(double latitude, double longitude) implements SafePlace {}

public class Sample {
  public static void main(String[] args) {
    Location location = new Location(123.33, -84.23);

    SafePlace safePlace =  location;

    System.out.println(location);
  }
}

