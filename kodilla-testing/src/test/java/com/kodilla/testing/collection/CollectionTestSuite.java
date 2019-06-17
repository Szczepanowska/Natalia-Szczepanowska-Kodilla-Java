package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.Assert;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {


    @Before
    public void before(){
        System.out.println("Test: begin");
    }
    @After
    public void after(){
        System.out.println("Test: end");
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        List<Integer> data = new ArrayList<>();
        data.add(1);
        data.add(2);
        data.add(3);

        OddNumberExterminator exterminator = new OddNumberExterminator();
        List<Integer> result = exterminator.exterminate(data);

        Assert.assertEquals(result.size(), 2);
    }

    public void testOddNumbersExterminatorEmptyList() {
        List<Integer> data = new ArrayList<>();


        OddNumberExterminator exterminator2 = new OddNumberExterminator();
        List<Integer> result2 = exterminator2.exterminate(data);

        Assert.assertEquals(result2.size(), 2);
    }
}

