package com.mycompany.app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraTest {
    @Test
    public void pruebaSuma(){
        int resultado = Calculadora.suma(1,2);
        assertEquals(3, resultado);
    }
    @Test
    public void pruebaMulti(){
        int resultado = Calculadora.multi(1,2);
        assertEquals(2, resultado);
    }
    @Test
    public void pruebaDivi(){
        float resultado = Calculadora.divi(1,2);
        assertEquals(0.5, resultado, 0.01);
    }
}
