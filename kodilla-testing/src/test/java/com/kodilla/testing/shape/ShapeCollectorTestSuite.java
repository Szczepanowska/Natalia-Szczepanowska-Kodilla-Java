package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
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
    public boolean testRemoveFigure(){

    Shape s1 = new Circle("Circle1", 2.0);
    Shape s2 = new Square("Square1", 5.3);
    Shape s3 = new Triangle("Triangle1", 2.5, 1.6);

    List <Shape> shapes = new ArrayList<>();
    shapes.add(s1);
    shapes.add(s2);
    shapes.add(s3);

        ShapeCollector collector = new ShapeCollector();
        boolean result = collector.removeFigure(s2);

        Assert.assertTrue(result);
        Assert.assertEquals(2, shapes.size());
        return result;
    }

    @Test
    public void testGetFigure(){


        Shape s1 = new Circle("Circle1", 2.0);
        Shape s2 = new Square("Square1", 5.3);
        Shape s3 = new Triangle("Triangle1", 2.5, 1.6);

        List <Shape> shapes = new ArrayList<>();
        shapes.add(s1);
        shapes.add(s2);
        shapes.add(s3);

        Shape result = shapes.get(0);
        Assert.assertEquals(result, s1);


    }

    @Test
    public List <Shape> showFigures() {
        Shape s1 = new Circle("Circle1", 2.0);
        Shape s2 = new Square("Square1", 5.3);
        Shape s3 = new Triangle("Triangle1", 2.5, 1.6);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(s1);
        shapes.add(s2);
        shapes.add(s3);

        return shapes;


    }
}
