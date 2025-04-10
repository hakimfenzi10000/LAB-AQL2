package BranchCoverageTest;

import org.example.exo02.AnagramFixed;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exo2Test {
    @Test
    void testAnagramTrueBranch() {
        assertTrue(AnagramFixed.isAnagram("chien", "niche")); // branche true
    }

    @Test
    void testAnagramFalseBranchDifferentLength() {
        assertFalse(AnagramFixed.isAnagram("abc", "abcd")); // s1.length != s2.length
    }

    @Test
    void testAnagramFalseBranchMismatchCount() {
        assertFalse(AnagramFixed.isAnagram("test", "best")); // même longueur, lettres différentes
    }

    @Test
    void testEdgeCaseEmptyStrings() {
        assertTrue(AnagramFixed.isAnagram("", "")); // cas vide, branche true
    }

    @Test
    void testBranchNullFirst() {
        assertThrows(NullPointerException.class, () -> AnagramFixed.isAnagram(null, "abc"));
    }

    @Test
    void testBranchNullSecond() {
        assertThrows(NullPointerException.class, () -> AnagramFixed.isAnagram("abc", null));
    }
}
