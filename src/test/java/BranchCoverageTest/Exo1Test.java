package ConditionCoverageTest;

import org.example.exo01.PalindromeFixed;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exo1Test {
    @Test
    public void testConditions() {
        assertThrows(NullPointerException.class, () -> PalindromeFixed.isPalindrome(null));
        assertTrue(PalindromeFixed.isPalindrome("RaceCar"));
        assertFalse(PalindromeFixed.isPalindrome("Testing"));
        assertTrue(PalindromeFixed.isPalindrome("No lemon no melon"));
    }
}
