import java.util.*;

record Location(double latitude, double longitude) {
  public Location {
    latitude = Math.floor(latitude * 100) / 100;
    //transforming the latitude before it is passed to the real
    //constructor
  }
}

public class Sample {
  public static void main(String[] args) {
    Location location1 = new Location(124.32345, -84.3234);
    //suppose we are told that latitude should be in 2 decimal places

    System.out.println(location1);
  }
}

//Think of the compact constructor not as a constructor.

//Think of it as an interceptor that transforms or maps data between 
//your code and the real contructor.

//In the compact constructor, you can transform the data and/or
//perform error checking. Any data you do not transform are
//passed as is to the constructor (like longitude in this example).
//Any data your transform, clense, mask, etc. are passed after
//the transformation to the constructor.

/*
  
124.32345, -84.32 -->       ....   124.32, -84.32 --> 
 your code              compact constructor           real constructor
*/

