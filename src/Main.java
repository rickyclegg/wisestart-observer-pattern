import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Running application...");

        StockMarket ftse = new StockMarket("London Stock Exchange");

        ftse.startTrading();
    }
}
