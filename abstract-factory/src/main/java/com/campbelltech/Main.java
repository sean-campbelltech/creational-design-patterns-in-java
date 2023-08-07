package com.campbelltech;

public class Main {
    public static void main(String[] args) {
        Country country = Country.SPAIN;
        InternationalFactory factory = InternationalProvider.create(country);
        Language language = factory.createLanguage();
        CapitalCity capital = factory.createCapital();

        System.out.println("Country: " + country);
        System.out.println("Capital: " + capital.getClass().getSimpleName());
        language.greet();
        System.out.println("Total Population: " + capital.getPopulation());
        System.out.println("Top Attractions: " + capital.listTopAttractions());
    }
}