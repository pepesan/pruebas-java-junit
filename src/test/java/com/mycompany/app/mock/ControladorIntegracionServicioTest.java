package com.mycompany.app.mock;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

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
        when(servicio.getData()).thenReturn(new ArrayList<String>());
        Controlador c= new Controlador();
        c.setServicio(servicio);
        c.getServiceData();
        c.procesaData();
        List<String> listadoEsperado = new ArrayList<String>();
        listadoEsperado.add("!");
        assertEquals(listadoEsperado, c.getData() );
    }
}
