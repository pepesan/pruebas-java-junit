package com.mycompany.app.mock;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ControladorUnitTest {
    @Test
    public void iniciaGuay(){
       Controlador c = new Controlador();
       assertNotNull(c);
       assertNotNull(c.getData());
       assertNotNull(c.getServicio());
       assertEquals(new ArrayList<String>(),c.getData());
    }
    /*
    @Test
    public void procesaDataGuay(){
        Controlador c = new Controlador();
        c.setData("Hola");
        c.procesaData();
        assertEquals("Hola!", c.getData());
    }

     */
}
