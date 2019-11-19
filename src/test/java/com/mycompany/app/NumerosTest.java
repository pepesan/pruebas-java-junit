package com.mycompany.app;

import static org.junit.Assert.*;
import org.junit.Test;

public class NumerosTest {
    @Test
    public void incrementoEn2(){
        Numeros n= new Numeros(2);
        n.inc(2);
        assertEquals(4, n.numero);
    }
    @Test
    public void incrementoEn3(){
        Numeros n= new Numeros(2);
        n.inc(3);
        assertEquals(5, n.numero);
    }
}
