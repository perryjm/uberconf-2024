import java.util.*;

record Location(double latitude, double longitude) {
  public Location {
    latitude = Math.floor(latitude * 100) / 100;
  }

  public Location(double latitude) {
    this(latitude, 90);
  }
}

public class Sample {
  public static void main(String[] args) {
    Location location1 = new Location(124.32345, -84.3234);
    System.out.println(location1);

    Location location2 = new Location(114.65);
    System.out.println(location2);
  }
}

