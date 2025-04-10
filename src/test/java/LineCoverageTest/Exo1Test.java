package LineCoverageTest;

import org.example.exo01.PalindromeFixed;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exo1Test {
    @Test
    public void testPalindrome_True() {
        assertTrue(PalindromeFixed.isPalindrome("radar"));
    }

    @Test
    public void testPalindrome_False() {
        assertFalse(PalindromeFixed.isPalindrome("hello"));
    }
}
