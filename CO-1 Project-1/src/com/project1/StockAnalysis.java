package com.project1;

public abstract class StockAnalysis {
    public final void analyzeStock(String stockSymbol) {
        fetchStockData(stockSymbol);
        performAnalysis();
        generateReport();
    }

    protected abstract void fetchStockData(String stockSymbol);

    protected abstract void performAnalysis();

    protected void generateReport() {
        System.out.println("Generating stock analysis report...");
    }
}
