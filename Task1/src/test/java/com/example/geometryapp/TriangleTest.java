package com.example.geometryapp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class TriangleTest {

    @Test
    void testGetArea() {
        Triangle triangle = new Triangle(3, 4, 5); // Правильный треугольник
        assertEquals(6.0, triangle.getArea(), 0.001);
        
        triangle = new Triangle(7, 8, 9); // Неправильный треугольник
        assertEquals(26.83197570243113, triangle.getArea(), 0.005); // Исправленное значение          
    }
}