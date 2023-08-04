package com.campbelltech;

public class LazyInitializedSingletonLogger extends SingletonBase {
    private static LazyInitializedSingletonLogger instance;

    private LazyInitializedSingletonLogger() {}

    public static LazyInitializedSingletonLogger getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingletonLogger();
        }
        return instance;
    }
}
