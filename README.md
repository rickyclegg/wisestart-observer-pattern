# WiseStart Academy Observer Pattern Coding Challenge

## Real-Time Stock Price Notifications

This repository contains a coding challenge designed to help junior software engineers understand and implement the Observer Design Pattern in Java. The challenge involves creating a system to notify registered clients about changes in stock prices.

## Project Structure

The project consists of the following classes:

- `Observer.java`: An interface for defining the contract for observers.
- `Subject.java`: An interface for defining the contract for subjects.
- `Stock.java`: A class that implements the `Subject` interface, represents a stock, and notifies observers of price changes.
- `Client.java`: A class that implements the `Observer` interface and gets updates about stock price changes.
- `StockMarket.java`: Creates a new StockMarket it has a `startTrading` function.
- `Main.java`: A driver class to simulate stock price changes and demonstrate the observer pattern in action.

## Challenge Instructions

### Part 1: Implement the Observer Pattern

1. Create an instance of a Stock E.G "Wise PLC" in `ftse.startTrading`.
2. Create a few clients and register them as observers of the stock.
3. Simulate stock price changes by updating the stock price.

If you are struggling checkout branch `hint` for a hint.

Run your application and see the printed information.  
You can either click the Play button in the top right corner of the editor or run the `Main.java` file.  
or you can run the following command in the terminal:

```bash
cd ./src
javac Main.java
java Main
```

### Part 2: Multiple Stocks

1. Add another stock and make different clients observe different stocks.
2. Make one client listen to multiple stocks.

Keep running the application and see your output.

### Part 3: BONUS
1. Update registerObserver to not allow duplicate clients.
2. Add another StockMarket.
3. Inject the clients into the StockMarket constructor so that they can listen to both StockMarkets. You can assume that all clients trade all stocks in a market.

If you want to see the final solution, checkout the `solution` branch.
