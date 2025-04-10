package ConditionCoverageTest;

import org.example.exo05.RomanNumeralFixed;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo5Test {

    @Test
    public void testValidLowerBound() {
        assertEquals("I", RomanNumeralFixed.toRoman(1));
    }

    @Test
    public void testValidUpperBound() {
        assertEquals("MMMCMXCIX", RomanNumeralFixed.toRoman(3999));
    }

    @Test
    public void testInvalidLowerBound() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeralFixed.toRoman(0));
    }

    @Test
    public void testInvalidUpperBound() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeralFixed.toRoman(4000));
    }
}
