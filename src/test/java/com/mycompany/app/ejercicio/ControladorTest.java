package com.mycompany.app.ejercicio;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ControladorTest {
    private Controlador c;

    @Before
    public void setup() {
        c = new Controlador();
    }
    @Test
    public void checkContructor(){
        assertNotNull(c.getModelo());
    }
    @Test
    public void checkModel(){
        Modelo modeloMockeado = spy(c.getModelo());
        c.setModelo(modeloMockeado);
        c.list();
        verify(modeloMockeado).list();
    }
    @Test
    public void checkModelProcessing(){
        Modelo modeloMockeado = spy(c.getModelo());
        c.setModelo(modeloMockeado);
        List<String> listadoEsperado = new ArrayList<String>();
        listadoEsperado.add("Uno");
        listadoEsperado.add("Dos");
        when(modeloMockeado.list()).thenReturn(listadoEsperado);
        c.list();
        assertEquals("Uno1",c.getDatosProcesados().get(0));
        assertEquals("Dos1",c.getDatosProcesados().get(1));
    }
}
