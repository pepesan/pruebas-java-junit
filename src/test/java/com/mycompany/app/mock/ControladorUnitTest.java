package com.mycompany.app.mock;

import com.mycompany.app.Controlador;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ControladorUnitTest {
    @Test
    public void iniciaGuay(){
       Controlador c = new Controlador();
       assertNotNull(c);
       assertEquals("",c.getData());
    }
    @Test
    public void procesaDataGuay(){
        Controlador c = new Controlador();
        c.setData("Hola");
        c.procesaData();
        assertEquals("Hola!", c.getData());
    }
}
