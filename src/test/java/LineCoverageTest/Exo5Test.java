package LineCoverageTest;

import org.example.exo05.RomanNumeralFixed;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo5Test {

    @Test
    public void testToRoman1() {
        assertEquals("I", RomanNumeralFixed.toRoman(1));
    }

    @Test
    public void testToRoman58() {
        assertEquals("LVIII", RomanNumeralFixed.toRoman(58));
    }

    @Test
    public void testToRoman1994() {
        assertEquals("MCMXCIV", RomanNumeralFixed.toRoman(1994));
    }
}
