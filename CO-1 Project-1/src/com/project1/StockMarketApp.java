package com.project1;

public class StockMarketApp {

    public static void main(String[] args) {
        // Create Stock Market
        StockMarket stockMarket = new StockMarket();
        
        // Create Investors
        Investor investor1 = new ConcreteInvestor("Alice");
        Investor investor2 = new ConcreteInvestor("Bob");
        
        // Register Investors
        stockMarket.addObserver(investor1);
        stockMarket.addObserver(investor2);
        
        // Set stock data and notify investors
        stockMarket.setStockData("AAPL", 150.75, 2000000);
        stockMarket.setStockData("GOOGL", 2800.50, 1500000);
        
        // Perform Technical and Fundamental Analysis
        StockAnalysis technicalAnalysis = new TechnicalAnalysis();
        StockAnalysis fundamentalAnalysis = new FundamentalAnalysis();
        
        technicalAnalysis.analyzeStock("AAPL");
        fundamentalAnalysis.analyzeStock("GOOGL");
    }
}
