package com.example.geometryapp;

public class Rhombus {
    
    private double diagonal1;
    private double diagonal2;

    public Rhombus(double d1, double d2) {
        this.diagonal1 = d1;
        this.diagonal2 = d2;
    }

    public double getArea() {
        return (diagonal1 * diagonal2) / 2;
    }
}