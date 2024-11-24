package com.example.geometryapp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class RectangleTest {

    @Test
    void testGetArea() {
        Rectangle rectangle = new Rectangle(10, 20);
        assertEquals(200.0, rectangle.getArea());
    }
}