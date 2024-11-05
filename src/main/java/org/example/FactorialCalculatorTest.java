package org.example;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialCalculatorTest {
    FactorialCalculator calculator = new FactorialCalculator();

    @Test
    @DisplayName("Целые положительные числа")
    void factorialFiveAssertTrueTest() {
        long factFive = calculator.factorial(5);
        assertEquals(120, factFive);
    }

    @Test
    @DisplayName("Целые положительные числа")
    void factorialFiveAssertFalseTest() {
        FactorialCalculator Factorial;
        long factFive = calculator.factorial(5);
        assertNotEquals(121, factFive);
    }
}
