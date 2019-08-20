package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {


    @Before
    public void before() {
        System.out.println("Test: begin");
    }

    @After
    public void after() {
        System.out.println("Test: end");
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        List<Integer> data = new ArrayList<>();
        data.add(1);
        data.add(2);
        data.add(3);

        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> result = exterminator.exterminate(data);

        Assert.assertEquals(result.size(), 1);
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        List<Integer> data2 = new ArrayList<>();


        OddNumbersExterminator exterminator2 = new OddNumbersExterminator();
        List<Integer> result2 = exterminator2.exterminate(data2);

        Assert.assertEquals(result2.size(), 0);
    }
}

