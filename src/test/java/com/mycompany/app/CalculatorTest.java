package com.mycompany.app;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
public class CalculatorTest {
    Calculator calculator;
    @Before
    public void antes(){
        calculator = new Calculator();
    }
    @Test
    public void evaluatesExpression() {
        int sum = calculator.evaluate("1+2+3");
        assertEquals(6, sum);
    }
    @Test
    public void evaluatesExpression2() {
        int sum = calculator.evaluate("1+2");
        assertEquals(3, sum);
    }
}
