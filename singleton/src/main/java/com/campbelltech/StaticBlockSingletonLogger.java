package com.campbelltech;

public class StaticBlockSingletonLogger extends SingletonBase {
    private static StaticBlockSingletonLogger instance;

    private StaticBlockSingletonLogger() {}

    static {
        try {
            instance = new StaticBlockSingletonLogger();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred while creating singleton instance.");
        }
    }

    public static StaticBlockSingletonLogger getInstance() {
        return instance;
    }
}
