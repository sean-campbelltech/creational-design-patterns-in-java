package com.campbelltech;

public class BillPughSingletonLogger extends SingletonBase {
    private BillPughSingletonLogger() {}

    private static class SingletonHelper {
        private static final BillPughSingletonLogger INSTANCE = new BillPughSingletonLogger();
    }

    public static BillPughSingletonLogger getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
