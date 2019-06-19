package com.kodilla.testing.shape;

public class Circle implements Shape {
    String name;
    Double r;

    public Circle (String name, Double r){
        this.name = name;
        this.r = r;
    }
    @Override
    public String getShapeName() {
        return name;
    }

   @Override
    public Double getField(){
        return Math.PI*(r^2);
    }
}
