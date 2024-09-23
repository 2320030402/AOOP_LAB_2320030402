package com.project1;

public class FundamentalAnalysis extends StockAnalysis {

    @Override
    protected void fetchStockData(String stockSymbol) {
        System.out.println("Fetching stock data for fundamental analysis of " + stockSymbol);
        // Simulate fetching financial statements
    }

    @Override
    protected void performAnalysis() {
        System.out.println("Performing fundamental analysis based on company financials...");
    }
}
