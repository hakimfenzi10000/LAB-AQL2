package BranchCoverageTest;

import org.example.exo06.FizzBuzzFixed;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exo6Test {
    @Test
    public void testFizzBuzz_ThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzzFixed.fizzBuzz(0));
    }

    @Test
    public void testFizzBuzz_AllBranches() {
        assertEquals("FizzBuzz", FizzBuzzFixed.fizzBuzz(15));
        assertEquals("Fizz", FizzBuzzFixed.fizzBuzz(6));
        assertEquals("Buzz", FizzBuzzFixed.fizzBuzz(10));
        assertEquals("7", FizzBuzzFixed.fizzBuzz(7));
    }
}
