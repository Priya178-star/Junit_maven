package org.bnm.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for Calculator class.
 */
public class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void testSubtraction() {
        assertEquals(1, calc.subtract(3, 2));
    }

    @Test
    public void testMultiplication() {
        assertEquals(6, calc.multiply(2, 3));
    }
}
