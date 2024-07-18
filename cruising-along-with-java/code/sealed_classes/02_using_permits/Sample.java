import java.util.*;

//final class BrokenLight implements TrafficLight {} //ERROR
final class FlashingLight implements TrafficLight {}

public class Sample {
  public static void main(String[] args) {
    TrafficLight trafficLight = new RedLight();

    System.out.println(trafficLight);
  }
}

