package Test.pt.Calculator;

import org.junit.jupiter.api.Test;
import pt.Calculator.Calculator;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void addTwoPositiveNumberTest() {
        int a = 5;
        int b = 4;
        int result = calculator.add(a, b);
        int expect  = a + b;

        assertEquals(expect, result);
    }

    @Test
    void addTwoNegativeNumber() {
        int a = -5;
        int b = -4;
        int result = calculator.add(a, b);
        int expect  = a + b;

        assertEquals(expect, result);
    }

    @Test
    void addPositiveNumberToNegativeNumber() {
        int a = 5;
        int b = -4;
        int result = calculator.add(a, b);
        int expect  = a + b;

        assertEquals(expect, result);
    }

    @Test
    void addNegativeNumberToPositiveNumber() {
        int a = -5;
        int b = 4;
        int result = calculator.add(a, b);
        int expect  = a + b;

        assertEquals(expect, result);
    }

    @Test
    void subtractTwoPositiveNumber() {
        int a = 5;
        int b = 4;
        int result = calculator.subtract(a, b);
        int expect  = a - b;

        assertEquals(expect, result);
    }

    @Test
    void subtractTwoNegativeNumber() {
        int a = -5;
        int b = -4;
        int result = calculator.subtract(a, b);
        int expect  = a - b;

        assertEquals(expect, result);
    }

    @Test
    void subtractPositiveNumberToNegativeNumber() {
        int a = 5;
        int b = -4;
        int result = calculator.subtract(a, b);
        int expect  = a - b;

        assertEquals(expect, result);
    }

    @Test
    void subtractNegativeNumberToPositiveNumber() {
        int a = -5;
        int b = 4;
        int result = calculator.subtract(a, b);
        int expect  = a - b;

        assertEquals(expect, result);
    }

    @Test
    void multiplyTwoPositiveNumber() {
        int a = 5;
        int b = 4;
        int result = calculator.multiply(a, b);
        int expect  = a * b;

        assertEquals(expect, result);
    }

    @Test
    void multiplyTwoNegativeNumber() {
        int a = -5;
        int b = -4;
        int result = calculator.multiply(a, b);
        int expect  = a * b;

        assertEquals(expect, result);
    }

    @Test
    void multiplyPositiveNumberToNegativeNumber() {
        int a = 5;
        int b = -4;
        int result = calculator.multiply(a, b);
        int expect  = a * b;

        assertEquals(expect, result);
    }

    @Test
    void multiplyNegativeNumberToPositiveNumber() {
        int a = -5;
        int b = 4;
        int result = calculator.multiply(a, b);
        int expect  = a * b;

        assertEquals(expect, result);
    }

}