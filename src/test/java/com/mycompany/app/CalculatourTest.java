package com.mycompany.app;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatourTest {
    @Test
    public void pruebaSuma(){
        int i = Calculatour.sumar(1,2);
        assertEquals(3,i);
    }
    @Test
    public void pruebaMultiplica(){
        int i = Calculatour.multiplicar(1,2);
        assertEquals(2,i);
    }
    @Test
    public void pruebaDividir(){
        float i = Calculatour.dividir(2,1);
        assertEquals(2.0,i, 0);
    }
}
