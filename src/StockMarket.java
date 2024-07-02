public class StockMarket {
    public String name;

    public StockMarket(String name) {
        this.name = name;
    }

    public void startTrading() {
        System.out.println(name + " is open for trading!");
    }
}
