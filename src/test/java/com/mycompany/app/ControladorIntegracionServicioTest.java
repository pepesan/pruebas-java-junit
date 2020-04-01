package com.mycompany.app;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class ControladorIntegracionServicioTest {
    @Mock
    private Servicio servicio;
    @Before
    public void initMocks() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void procesaDatosServicioGuay(){
        when(servicio.getData()).thenReturn("Dato Mockeado");
        Controlador c= new Controlador();
        c.setServicio(servicio);
        c.getServiceData();
        c.procesaData();
        assertEquals("Dato Mockeado!", c.getData() );
    }
}
