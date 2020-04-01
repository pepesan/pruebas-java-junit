package com.mycompany.app.mock;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ServicioUnitTest {
    @Test
    public void pruebaGetData(){
        Servicio s = new Servicio();
        List<String> listadoEsperado = new ArrayList<String>();
        listadoEsperado.add("Hola");
        listadoEsperado.add("Adios");
        assertEquals(listadoEsperado, s.getData());
    }
}
