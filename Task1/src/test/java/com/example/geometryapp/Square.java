package com.example.geometryapp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SquareTest {

    @Test
    void testGetArea() {
        Square square = new Square(5);
        assertEquals(25.0, square.getArea());
    }
}