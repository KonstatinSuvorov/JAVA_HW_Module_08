package com.example.geometryapp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class RhombusTest {

    @Test
    void testGetArea() {
        Rhombus rhombus = new Rhombus(12, 16);
        assertEquals(96.0, rhombus.getArea());
    }
}