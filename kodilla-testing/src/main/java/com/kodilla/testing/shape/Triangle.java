package com.kodilla.testing.shape;

public class Triangle implements Shape {

    String name;
    Double a;
    Double h;

    public Triangle (String name, Double a, Double h){
        this.name = name;
        this.a = a;
        this.h = h;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    public Double getField() {
        return (a*h)/2;
    }
}
