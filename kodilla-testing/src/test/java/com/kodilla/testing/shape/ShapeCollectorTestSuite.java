package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {

    @Test
    public void testAddFigure(){

         ArrayList<String> shapes = new ArrayList<String>();

        shapes.add("Square");
        shapes.add("Triangle");
        shapes.add("Circle");

        Assert.assertEquals(3, shapes.size());
    }

    @Test
    public void testRemoveFigure(){

        ArrayList<String> shapes = new ArrayList<String>();

        shapes.add("Square");
        shapes.add("Triangle");
        shapes.add("Circle");

    boolean result = shapes.remove(2);

        Assert.assertTrue(result);
        Assert.assertEquals(2, shapes.size());
    }

    @Test
    public void testGetFigure(){
        ArrayList<String> shapes = new ArrayList<String>();

        shapes.add("Square");
        shapes.add("Triangle");
        shapes.add("Circle");

        String result = shapes.get(0);
        Assert.assertEquals(result, "Square");


    }
}
