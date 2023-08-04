package com.campbelltech;

// ConcreteFactory1
public class EnglandFactory implements InternationalFactory {
    @Override
    public Language createLanguage() {
        return new English();
    }

    @Override
    public CapitalCity createCapital() {
        return new London();
    }
}
