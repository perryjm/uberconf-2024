import java.util.*;

//record Location(double latitude, double longitude) extends Object {} //ERROR
//record Location(double latitude, double longitude) extends java.lang.Record {}

record Location(double latitude, double longitude) {}

//a record already extends java.lang.Record, you are not allowed
//to extend from anything.

public class Sample {
  public static void main(String[] args) {
    Location location = new Location(123.33, -84.23);

    Record record = location; //java.lang.Record is the base
    //of any record.

    System.out.println(location);
  }
}

