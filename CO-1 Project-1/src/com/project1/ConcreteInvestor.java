package com.project1;

public class ConcreteInvestor implements Investor {
    private String name;

    public ConcreteInvestor(String name) {
        this.name = name;
    }

    public void update(String stockSymbol, double price, double volume) {
        System.out.println(name + " notified: " + stockSymbol + " price changed to " + price + ", volume: " + volume);
    }
}
