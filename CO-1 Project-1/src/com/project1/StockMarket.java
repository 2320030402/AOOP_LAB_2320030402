package com.project1;

import java.util.ArrayList;
import java.util.List;

public class StockMarket {
    private List<Investor> investors = new ArrayList<>();
    private String stockSymbol;
    private double price;
    private double volume;

    public void addObserver(Investor investor) {
        investors.add(investor);
    }

    public void removeObserver(Investor investor) {
        investors.remove(investor);
    }

    public void setStockData(String stockSymbol, double price, double volume) {
        this.stockSymbol = stockSymbol;
        this.price = price;
        this.volume = volume;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Investor investor : investors) {
            ((Investor) investor).update(stockSymbol, price, volume);
        }
    }
}
