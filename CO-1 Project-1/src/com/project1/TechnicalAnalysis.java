package com.project1;

public class TechnicalAnalysis extends StockAnalysis {

    @Override
    protected void fetchStockData(String stockSymbol) {
        System.out.println("Fetching stock data for technical analysis of " + stockSymbol);
        // Simulate fetching technical indicators
    }

    @Override
    protected void performAnalysis() {
        System.out.println("Performing technical analysis based on stock price movements...");
    }
}