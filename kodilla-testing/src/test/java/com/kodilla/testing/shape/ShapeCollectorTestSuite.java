package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollectorTestSuite {

    private List <Shape> shapes = new ArrayList<>();

    @Test
    public void testAddFigure(){

         Shape s1 = new Circle("o", 2.0);
         ShapeCollector collector = new ShapeCollector();

        collector.addFigure(s1);

        Assert.assertEquals(s1, collector.getFigure(0));
    }

    @Test
    public void testRemoveFigure(){


        ShapeCollector collector = new ShapeCollector();
        collector.removeFigure(shapes.get(0));


        Assert.assertEquals(2, shapes.size());

    }

    @Test
    public void testGetFigure(){

        ShapeCollector collector = new ShapeCollector();

        collector.getFigure(0);

        Shape result = shapes.get(0);
        Assert.assertEquals(result, shapes.get(0));


    }

    @Test
    public void showFigures() {

        ShapeCollector collector = new ShapeCollector();
        collector.showFigures();



    }
}
