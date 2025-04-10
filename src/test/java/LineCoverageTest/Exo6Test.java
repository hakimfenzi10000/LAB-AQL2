package LineCoverageTest;

import org.example.exo06.FizzBuzzFixed;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exo6Test {
    @Test
    public void testFizzBuzz_FizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzzFixed.fizzBuzz(15));
    }

    @Test
    public void testFizzBuzz_Fizz() {
        assertEquals("Fizz", FizzBuzzFixed.fizzBuzz(3));
    }

    @Test
    public void testFizzBuzz_Buzz() {
        assertEquals("Buzz", FizzBuzzFixed.fizzBuzz(5));
    }

    @Test
    public void testFizzBuzz_Number() {
        assertEquals("1", FizzBuzzFixed.fizzBuzz(1));
    }
}
