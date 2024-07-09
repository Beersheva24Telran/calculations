package telran.introduction;

import static org.junit.jupiter.api.Assertions.*;
import static telran.introduction.Calculations.*;

import org.junit.jupiter.api.Test;

public class CalculationsTest {
    @Test
    void sumTest() {
        assertEquals(4, sum(2, 2));
        assertEquals(0, sum(2, -2));
        assertEquals(-5, sum(-2, -3));
    }
    @Test
    void subtractTest() {
        assertEquals(0, subtract(2, 2));
        assertEquals(4, subtract(2, -2));
        assertEquals(1, subtract(-2, -3));
    }
    @Test
    void divideTest() {
        assertEquals(1, divide(2, 2));
        assertEquals(-1, divide(2, -2));
        assertEquals(0, divide(-2, -3));
        assertThrowsExactly(ArithmeticException.class, () -> divide(10, 0));
    }
    @Test
    void maxDigitTest() {
        assertEquals(3, maxDigit(-123));
        assertEquals(3, maxDigit(123));
        assertEquals(0, maxDigit(0));
    }
    @Test
    void sumOfDigitsTest() {
        assertEquals(6, sumOfDigits(-123));
        assertEquals(6, sumOfDigits(123));
        assertEquals(0, sumOfDigits(0));
    }
    @Test
    void isDividedOnTest() {
        assertTrue(isDividedOn(10, 2));
        assertTrue(isDividedOn(-10, 2));
        assertFalse(isDividedOn(10, 0));
        assertFalse(isDividedOn(10, 3));
    }
}
