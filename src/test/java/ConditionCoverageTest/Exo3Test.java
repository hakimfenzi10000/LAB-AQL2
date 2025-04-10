package ConditionCoverageTest;
import org.example.exo03.BinarySearchFixed;

import org.junit.Test;
import static org.junit.Assert.*;

public class Exo3Test {
    @Test
    public void testConditionTrueTrue() {
        int[] array = {1, 2};
        assertEquals(1, BinarySearchFixed.binarySearch(array, 2));
    }

    @Test
    public void testConditionTrueFalse() {
        int[] array = {1, 2};
        assertEquals(0, BinarySearchFixed.binarySearch(array, 1));
    }

    @Test
    public void testConditionFalse() {
        int[] array = {1, 2};
        assertEquals(-1, BinarySearchFixed.binarySearch(array, 3));
    }
}
