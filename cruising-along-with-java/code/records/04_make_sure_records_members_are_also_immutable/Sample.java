import java.util.*;

record Location(double latitude, double longitude, 
  //StringBuilder description) {} //bad idea
  String description) {} //good idea

//latitude and longitude are immutable and so is the reference
//description of the record. BUT, the StringBuilder itself
//is mutable. Please don't do this.

//make sure the components (properties) you use in record
//are also immutable.

//records are great candidate for composing other records.

public class Sample {
  public static void main(String[] args) {
    Location location = new Location(123.33, -84.23, "Federal prison");

    System.out.println(location);
  }
}

