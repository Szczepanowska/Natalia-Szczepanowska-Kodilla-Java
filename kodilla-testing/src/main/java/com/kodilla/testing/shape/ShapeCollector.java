package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
private List <Shape> shapes = new ArrayList<>();
Shape s1 = new Circle("Circle1", 2.0);
Shape s2 = new Square("Square1", 5.3);
Shape s3 = new Triangle("Triangle1", 2.5, 1.6);

    public void addFigure(Shape shape){
    shapes.add(s1);
    shapes.add(s2);
    shapes.add(s3);
    }

    public boolean removeFigure(Shape shape){
    return shapes.remove(s1);
    }

    public Shape getFigure(int n){
    return shapes.get(0);
    }

    public List <Shape> showFigures(){
    return shapes;
    }
}

