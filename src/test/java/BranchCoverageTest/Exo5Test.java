package BranchCoverageTest;

import org.example.exo05.RomanNumeralFixed;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo5Test {

    @Test
    public void testToRomanWithInvalidLow() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeralFixed.toRoman(0));
    }

    @Test
    public void testToRomanWithInvalidHigh() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeralFixed.toRoman(4000));
    }

    @Test
    public void testToRomanWithCommonNumber() {
        assertEquals("XLII", RomanNumeralFixed.toRoman(42));
    }

    @Test
    public void testToRomanWithSubtractiveNotation() {
        assertEquals("IX", RomanNumeralFixed.toRoman(9));
    }
}
