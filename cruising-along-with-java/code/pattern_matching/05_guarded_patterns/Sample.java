import java.util.*;

interface Trade {}
final record Buy(String ticker, int quantity) implements Trade {}
final record Sell(String ticker, int quantity) implements Trade {}

public class Sample {
  public static String process(Trade trade) {
    return switch(trade) {
      case Buy buy when buy.quantity() > 1000 -> 
        "we're buying " + buy.ticker() + " but get audited";
      case Buy buy -> "we're buying " + buy.ticker();
      case Sell sell -> "we're selling " + sell.ticker();
      case Trade t -> "generic trade"; 
    };
  }

  public static void main(String[] args) {
    System.out.println(process(new Buy("GOOG", 100)));
    System.out.println(process(new Buy("AMZN", 5000)));
    System.out.println(process(new Sell("GOOG", 50)));
  }
}

