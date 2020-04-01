package com.mycompany.app;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class CalculatorTest {
    Calculator calculator;
    @Before
    public void antes(){
        calculator = new Calculator();
        System.out.println("antes de un test");
    }
    @After
    public void despues(){
        System.out.println("después de un test");
    }
    @BeforeClass
    public static void antesClase(){
        System.out.println("antes de clase");
    }
    @AfterClass
    public static void despuesClase(){
        System.out.println("despues de clase");
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
    @Test
    public void evaluatesExpression3() {
        int sum = calculator.evaluate("2+2");
        assertEquals(4, sum);
    }

}
