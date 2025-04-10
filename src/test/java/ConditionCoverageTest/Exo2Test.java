package ConditionCoverageTest;

import org.example.exo02.Anagram;
import org.example.exo02.AnagramFixed;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

 class EXO2Test {

    @Test
    void testBothNull() {
        assertThrows(NullPointerException.class, () -> AnagramFixed.isAnagram(null, null));
    }

    @Test
    void testFirstNullSecondNotNull() {
        assertThrows(NullPointerException.class, () -> AnagramFixed.isAnagram(null, "test"));
    }

    @Test
    void testFirstNotNullSecondNull() {
        assertThrows(NullPointerException.class, () -> AnagramFixed.isAnagram("test", null));
    }

    @Test
    void testDifferentLengthsCondition() {
        assertFalse(AnagramFixed.isAnagram("abc", "abcd"));  // condition sur les longueurs
    }

    @Test
    void testSameLengthNotAnagram() {
        assertFalse(AnagramFixed.isAnagram("test", "abcd")); // même longueur, mais lettres différentes
    }

    @Test
    void testSameLengthAnagram() {
        assertTrue(AnagramFixed.isAnagram("listen", "silent")); // cas positif avec lettres mélangées
    }
}
