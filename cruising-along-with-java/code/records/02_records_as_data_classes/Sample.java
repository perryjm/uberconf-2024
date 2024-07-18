import java.util.*;

record Location(double latitude, double longitude) {}
//you are given:
//constructor 
//getter for the components (properties) - but not using the JavaBean convention
//toString
//equals
//hashCode

public class Sample {
  public static void main(String[] args) {
    Location location = new Location(123.33, -84.23);
    Location location1 = new Location(123.33, -84.23);
    Location location2 = new Location(133.33, -44.23);

    System.out.println(location);

    System.out.println(location.latitude());
    System.out.println(location.longitude());

    System.out.println(location.equals(location1));
    System.out.println(location.equals(location2));
  }
}

