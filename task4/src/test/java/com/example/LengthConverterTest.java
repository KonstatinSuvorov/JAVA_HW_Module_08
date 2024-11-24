import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LengthConverterTest {
    
    @Test
    public void testMmToCm() {
        assertEquals(10, LengthConverter.mmToCm(100), 0.001);
    }
    
    @Test
    public void testMmToDm() {
        assertEquals(1, LengthConverter.mmToDm(100), 0.001);
    }
    
    @Test
    public void testMmToM() {
        assertEquals(0.1, LengthConverter.mmToM(100), 0.001);
    }
    
    @Test
    public void testMmToKm() {
        assertEquals(0.0001, LengthConverter.mmToKm(100), 0.00001);
    }
    
    @Test
    public void testCmToMm() {
        assertEquals(1000, LengthConverter.cmToMm(100), 0.001);
    }

    @Test
    public void testCmToDm() {
        assertEquals(10, LengthConverter.cmToDm(100), 0.001);
    }

    @Test
    public void testCmToM() {
        assertEquals(1, LengthConverter.cmToM(100), 0.001);
    }
    
    @Test
    public void testCmToKm() {
        assertEquals(0.001, LengthConverter.cmToKm(100), 0.0001);
    }
    
    @Test
    public void testDmToMm() {
        assertEquals(100, LengthConverter.dmToMm(10), 0.001);
    }

    @Test
    public void testDmToCm() {
        assertEquals(100, LengthConverter.dmToCm(10), 0.001);
    }
    
    @Test
    public void testDmToM() {
        assertEquals(1, LengthConverter.dmToM(10), 0.001);
    }

    @Test
    public void testDmToKm() {
        assertEquals(0.001, LengthConverter.dmToKm(10), 0.0001);
    }

    @Test
    public void testMToMm() {
        assertEquals(1000, LengthConverter.mToMm(1), 0.001);
    }

    @Test
    public void testMToCm() {
        assertEquals(100, LengthConverter.mToCm(1), 0.001);
    }

    @Test
    public void testMToDm() {
        assertEquals(10, LengthConverter.mToDm(1), 0.001);
    }

    @Test
    public void testMToKm() {
        assertEquals(0.001, LengthConverter.mToKm(1), 0.0001);
    }

    @Test
    public void testKmToMm() {
        assertEquals(1000000, LengthConverter.kmToMm(1), 0.001);
    }

    @Test
    public void testKmToCm() {
        assertEquals(100000, LengthConverter.kmToCm(1), 0.001);
    }

    @Test
    public void testKmToDm() {
        assertEquals(10000, LengthConverter.kmToDm(1), 0.001);
    }

    @Test
    public void testKmToM() {
        assertEquals(1000, LengthConverter.kmToM(1), 0.001);
    }
}
