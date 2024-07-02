public class Client implements Observer {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void update(float price) {
        System.out.println("Client " + name + " notified. New price: " + price);
    }
}
