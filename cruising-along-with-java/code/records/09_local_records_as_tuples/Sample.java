import java.util.*;

public class Sample {
  public static int getPrice(String ticker) {
    return (int)(Math.random() * 1000);
  }

  public static void printPrices(List<String> tickers) {
    record Stock(String ticker, int price) {
      public String toString() { return "%s: $%d".formatted(ticker, price); }
    }

    tickers.stream()
      .map(ticker -> new Stock(ticker, getPrice(ticker)))
      .forEach(System.out::println);
  }

  public static void main(String[] args) {
    printPrices(List.of("GOOG", "AMZN", "INTC"));
  }
}

