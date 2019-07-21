package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Set;

public final class World {

    private final Set<Continent> worldsContinents;

    public World(final Set<Continent> worldsContinents) {
        this.worldsContinents = worldsContinents;
    }

    public Set<Continent> getWorldsContinents() {
        return worldsContinents;
    }



    public BigDecimal getPeopleQuantity() {
        return worldsContinents.stream()
                .flatMap(continent -> continent.getContinentCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
