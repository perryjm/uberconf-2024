import java.util.*;

interface Trade {}
final class Buy implements Trade {}
final class Sell implements Trade {}

public class Sample {
  public static String process(Trade trade) {
    return switch(trade) {
      //case Trade t -> "generic trade"; //ERROR
      case Buy buy -> "we're buying";
      case Sell sell -> "we're selling";
      case Trade t -> "generic trade";
    };
  }

  public static void main(String[] args) {
    System.out.println(process(new Buy()));
    System.out.println(process(new Sell()));
  }
}

