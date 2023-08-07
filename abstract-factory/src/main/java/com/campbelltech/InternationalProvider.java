package com.campbelltech;

public class InternationalProvider {
    public static InternationalFactory create(Country country) {
        switch (country) {
            case ENGLAND:
                return new EnglandFactory();
            case SPAIN:
                return new SpainFactory();
            default:
                throw new IllegalArgumentException("Invalid country: " + country);
        }
    }
}
