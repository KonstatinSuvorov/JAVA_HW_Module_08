package com.example.geometryapp;

public class Rectangle {
    
    private double width;
    private double height;

    public Rectangle(double w, double h) {
        this.width = w;
        this.height = h;
    }

    public double getArea() {
        return width * height;
    }
}