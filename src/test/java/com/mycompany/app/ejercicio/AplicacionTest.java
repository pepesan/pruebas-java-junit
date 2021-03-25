package com.mycompany.app.ejercicio;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

public class AplicacionTest {
    private Aplicacion app;
    @Before
    public void setup(){
        app = new Aplicacion();
    }
    @Test
    public void checkConstructor(){
        assertNotNull(app.controlador);
    }
    @Test
    public void checkControlador(){
        Controlador controladorMockeado = spy(app.controlador);
        app.controlador=controladorMockeado;
        app.main();
        verify(controladorMockeado).list();
    }
}
