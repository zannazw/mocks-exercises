package org.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class CalculatorTest {

    /**
     * Use Mockito to create a mock object of the Calculator class.
     * Simulate the behavior of the method add(int a, int b) so that it always returns 10,
     * no matter which arguments are passed.
     * Write a test case that checks whether the mock works correctly.
     */

    Calculator calculatorMock = Mockito.mock(Calculator.class);

    @Test
    void givenRandomInputNumbersWhenCalledTHenShouldAlwaysReturn10() {
        int a = (int) Math.floor(Math.random() * 101);
        int b = (int) Math.floor(Math.random() * 101);
        when(calculatorMock.add(a, b)).thenReturn(10);
        int expectedResult = 10;
        int actualResult = calculatorMock.add(a, b);

        assertEquals(expectedResult, actualResult);
    }
}