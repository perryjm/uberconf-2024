import java.util.*;

record Location(double latitude, double longitude) {
  public String display() {
    return "some details about the location...";
  }
}

public class Sample {
  public static void main(String[] args) {
    Location location = new Location(123.33, -84.23);

    System.out.println(location.display());
  }
}

