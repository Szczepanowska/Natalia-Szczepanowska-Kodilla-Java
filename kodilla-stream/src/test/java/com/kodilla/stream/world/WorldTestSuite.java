package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;;
import java.util.HashSet;
import java.util.Set;

public class WorldTestSuite {

    @Test

    public void testGetPeopleQuantity(){

        Set<Country> SouthAmerica = new HashSet<>();

        SouthAmerica.add(new Country ("Peru", new BigDecimal("100000000")));
        SouthAmerica.add(new Country ("Brazil", new BigDecimal ("200000000")));
        SouthAmerica.add(new Country ("Bolivia", new BigDecimal ("100000000")));

        Set<Country> Asia = new HashSet<>();
        Asia.add(new Country ("Japan", new BigDecimal ("500000000")));
        Asia.add(new Country ("Vietnam", new BigDecimal ("200000000")));
        Asia.add(new Country ("Korea", new BigDecimal ("100000000")));

        Set<Country> Europe = new HashSet<>();
        Europe.add(new Country ("Germany", new BigDecimal ("200000000")));
        Europe.add(new Country ("Italy", new BigDecimal ("200000000")));
        Europe.add(new Country ("Croatia", new BigDecimal ("100000000")));


        Set<Continent> worldsContinents = new HashSet<>();
        worldsContinents.add(new Continent ("South Amreica", SouthAmerica));
        worldsContinents.add(new Continent  ("Asia", Asia));
        worldsContinents.add(new Continent ("Europe", Europe));
        World world = new World(worldsContinents);


        BigDecimal totalPopulation = world.getPeopleQuantity();
        BigDecimal expectedPopulation = new BigDecimal("1700000000");
        Assert.assertEquals(expectedPopulation, totalPopulation);






    }
}
