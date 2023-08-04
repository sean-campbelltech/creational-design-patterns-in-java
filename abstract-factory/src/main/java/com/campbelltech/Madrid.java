package com.campbelltech;

import java.util.Arrays;
import java.util.List;

// ConcreteProductB2
public class Madrid implements CapitalCity {
    @Override
    public int getPopulation() {
        return 3200000;
    }

    @Override
    public List<String> listTopAttractions() {
        return Arrays.asList("Royal Palace", "Prado Museum", "Retiro Park");
    }
}
