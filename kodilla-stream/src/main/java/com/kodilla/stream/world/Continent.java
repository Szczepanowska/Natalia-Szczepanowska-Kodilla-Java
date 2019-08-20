package com.kodilla.stream.world;

import java.util.Set;

public final class Continent {

    private final String continentName;
    private final Set<Country> continentCountries;

    public Continent(String continentName, Set<Country> continentCountries) {
        this.continentName = continentName;
        this.continentCountries = continentCountries;
    }

    public String getContinentName() {
        return continentName;
    }

    public Set<Country> getContinentCountries() {
        return continentCountries;
    }


}
