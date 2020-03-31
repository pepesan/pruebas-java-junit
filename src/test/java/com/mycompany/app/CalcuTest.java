package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalcuTest {
    @Test
    public void inciaCalculadora(){
        Calcu c = new Calcu();
        assertNotNull(c);
    }
    @Test
    public void addTest(){
        assertEquals(2,Calcu.add(1,1));
    }
    @Test
    public void sumaOtroTest(){
        assertEquals(7,Calcu.add(2,5));
    }
}
