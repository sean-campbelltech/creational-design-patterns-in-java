package com.campbelltech;

public class Main {
    public static void main(String[] args) {
        SingletonBase singletonLogger1 = BillPughSingletonLogger.getInstance();
        SingletonBase singletonLogger2 = BillPughSingletonLogger.getInstance();

        if (singletonLogger1 == singletonLogger2) {
            System.out.println("Same instance, singleton pattern correctly implemented");
        }

        singletonLogger1.log("This is logged using a singleton logging system");
    }
}