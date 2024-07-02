import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Running application...");

        Client techTrader = new Client("Tech Trader");
        Client financeTrader = new Client("Finance Trader");

        StockMarket ftse = new StockMarket("London Stock Exchange", Arrays.asList(techTrader, financeTrader));
        StockMarket nasdaq = new StockMarket("Nasdaq", List.of(techTrader));

        ftse.startTrading();
        nasdaq.startTrading();
    }
}
