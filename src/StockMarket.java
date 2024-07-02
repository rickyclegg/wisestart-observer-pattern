public class StockMarket {
    public String name;

    public StockMarket(String name) {
        this.name = name;
    }

    public void startTrading() {
        System.out.println(name + " is open for trading!");

        // Creating stock
        Stock appleStock = new Stock("Apple");

        // Creating clients
        Client client1 = new Client("Tech Trader");

        // Registering clients to the stock
        appleStock.registerObserver(client1);

    }
}
