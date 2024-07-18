import java.util.*;

class Location {
  private final double latitude;
  private final double longitude;

  public Location(double theLatitude, double theLongitude) {
     latitude = theLatitude;
     longitude = theLongitude;
  }

  public double getLatitude() { return latitude; }
  public double getLongitude() { return longitude; }
}

public class Sample {
  public static void main(String[] args) {
    Location location = new Location(123.33, -84.23);

    System.out.println(location);
  }
}

