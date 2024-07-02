import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Stock implements Subject {
    private final HashSet<Observer> observers;
    private float price;
    private String stockName;

    public Stock(String stockName) {
        this.observers = new HashSet<>();
        this.stockName = stockName;
    }

    public void setPrice(float price) {
        this.price = price;
        System.out.println("Stock " + stockName + " price changed to " + price);
        notifyObservers();
    }

    public float getPrice() {
        return this.price;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this.price);
        }
    }
}
