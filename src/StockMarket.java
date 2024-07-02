import java.util.List;

public class StockMarket {
    public String name;
    private final List<Client> clients;

    public StockMarket(String name, List<Client> clients) {
        this.name = name;
        this.clients = clients;
    }

    public void startTrading() {
        System.out.println(name + " is open for trading!");

        // Creating stock
        Stock wiseStock = new Stock(name + " - Wise PLC");
        Stock appleStock = new Stock(name + " - Apple Inc");

        // Registering clients
        for (Client client : clients) {
            wiseStock.registerObserver(client);
            appleStock.registerObserver(client);
        }

        // Simulating price changes
        wiseStock.setPrice(150.0f);
        wiseStock.setPrice(155.0f);
        appleStock.setPrice(444.0f);

        // Unregistering a client
        wiseStock.removeObserver(clients.getFirst());

        // Simulating more price changes
        wiseStock.setPrice(160.0f);
        wiseStock.setPrice(165.0f);
        appleStock.setPrice(445.0f);
    }
}
