package com.campbelltech;

public class Main {
    public static void main(String[] args) {
        Country country = Country.SPAIN;
        Language language = InternationProvider.createLanguage(country);
        CapitalCity capital = InternationProvider.createCapital(country);

        System.out.println("Country: " + country);
        System.out.println("Capital: " + capital.getClass().getSimpleName());
        language.greet();
        System.out.println("Total Population: " + capital.getPopulation());
        System.out.println("Top Attractions: " + capital.listTopAttractions());
    }
}