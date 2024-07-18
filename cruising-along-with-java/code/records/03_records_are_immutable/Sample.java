import java.util.*;

record Location(double latitude, double longitude) {}

public class Sample {
  public static void main(String[] args) {
    Location location = new Location(123.33, -84.23);

    System.out.println(location.latitude());

    //location.latitude = 124.33; //ERROR
    //location.latitude(124.33); //ERROR

    //components (properties) of a record are immutable.
  }
}

