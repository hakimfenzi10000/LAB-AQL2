package ConditionCoverageTest;

import org.example.exo06.FizzBuzzFixed;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exo6Test {
    @Test
    public void testCondition_PositiveCheck() {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzzFixed.fizzBuzz(-1));
        assertEquals("1", FizzBuzzFixed.fizzBuzz(1));
    }

    @Test
    public void testCondition_ModuloChecks() {
        assertEquals("FizzBuzz", FizzBuzzFixed.fizzBuzz(30));
        assertEquals("Fizz", FizzBuzzFixed.fizzBuzz(9));
        assertEquals("Buzz", FizzBuzzFixed.fizzBuzz(20));
        assertEquals("7", FizzBuzzFixed.fizzBuzz(7));
    }
}
