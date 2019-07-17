package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ShapeCollectorTestSuite {



    @Test
    public void testAddFigure(){

         Shape s1 = new Circle("o", 2.0);

         ShapeCollector collector = new ShapeCollector();

         collector.addFigure(s1);

        Assert.assertEquals(s1, collector.getFigure(0));
    }

    @Test
    public void testRemoveFigure(){

        Shape s1 = new Circle("o", 2.0);

        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(s1);

        boolean result = collector.removeFigure(s1);

        Assert.assertTrue(result);
        Assert.assertEquals(0, collector.showFigures().size());



    }

    @Test
    public void testGetFigure(){

        Shape s1 = new Circle("o", 2.0);

        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(s1);


        Assert.assertEquals(collector.getFigure(0), s1);


    }

    @Test
    public void showFigures(){

        Shape s1 = new Circle("o", 2.0);
        Shape s2 = new Triangle("t", 5.5, 5.5);

        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(s1);
       collector.addFigure(s2);
        List<Shape> result = collector.showFigures();

        Assert.assertEquals(result.size(), 2);

        Assert.assertTrue(result.contains(s1));
        Assert.assertTrue(result.contains(s2));


    }
}
