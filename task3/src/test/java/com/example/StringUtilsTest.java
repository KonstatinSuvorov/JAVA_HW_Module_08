package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    public void testCountVowels() {
        assertEquals(2, StringUtils.countVowels("hello"));
    }

    @Test
    public void testCountConsonants() {
        assertEquals(3, StringUtils.countConsonants("hello"));
    }
}