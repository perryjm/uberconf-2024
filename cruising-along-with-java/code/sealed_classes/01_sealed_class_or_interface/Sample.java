import java.util.*;

//final class BrokenLight implements TrafficLight {} //ERROR

public class Sample {
  public static void main(String[] args) {
    TrafficLight trafficLight = new RedLight();

    System.out.println(trafficLight);
  }
}

