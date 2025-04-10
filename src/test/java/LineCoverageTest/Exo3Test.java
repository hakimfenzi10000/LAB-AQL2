package LineCoverageTest;
import org.junit.Test;
import static org.junit.Assert.*;
import org.example.exo03.BinarySearchFixed;

public class Exo3Test {
    @Test
    public void testElementFound() {
        int[] array = {1, 3, 5, 7, 9};
        assertEquals(2, BinarySearchFixed.binarySearch(array, 5));
    }

    @Test
    public void testElementNotFound() {
        int[] array = {1, 3, 5, 7, 9};
        assertEquals(-1, BinarySearchFixed.binarySearch(array, 4));
    }

    @Test(expected = NullPointerException.class)
    public void testNullArray() {
        BinarySearchFixed.binarySearch(null, 5);
    }
}
