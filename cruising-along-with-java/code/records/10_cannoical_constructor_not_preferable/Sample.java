import java.util.*;

record Location(double latitude, double longitude) {
  //Not a preferable approach
  public Location(double latitude, double longitude) {
    if(latitude > 180) {
      throw new RuntimeException("Out of this world");
    }

    this.latitude = latitude;
    this.longitude = longitude;
  }
}

public class Sample {
  public static void main(String[] args) {
    Location location1 = new Location(124.32, -84.32);

    try {
      new Location(323.32, -84.32);
    } catch(Exception ex) {
      System.out.println(ex);
    }

    System.out.println(location1);
  }
}

