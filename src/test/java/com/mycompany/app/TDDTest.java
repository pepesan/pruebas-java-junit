package com.mycompany.app;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TDDTest {
    Calcu c;
    @Before
    public void setup (){
        c = new Calcu();
    }

    @Test
    public void pruebaAdd(){
        int res= c.add(1,2);
        assertEquals(3, res);
    }
    @Test
    public void pruebaAdd2(){
        int res= c.add(2,2);
        assertEquals(4, res);
    }

    @Test
    public void pruebaMulti(){
        int res= c.multi(1,2);
        assertEquals(2, res);
    }
}
