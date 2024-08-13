package com.example.logging;

public class Application {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance(); 
        logger.log("Application started");
        logger.log("Performing some operations...");
        logger.log("Application finished");
    }
}