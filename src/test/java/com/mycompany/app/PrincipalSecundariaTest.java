package com.mycompany.app;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PrincipalSecundariaTest {

    @Test
    public void cogeListadoCorrecto(){
        Principal p= new Principal();
        //You can mock concrete classes, not only interfaces
        p.secundaria = mock(Secundaria.class);

        //stubbing
        when(p.secundaria.getListado()).thenReturn(new ArrayList<String>());
        assertEquals(0, p.secundaria.getListado().size());
    }
    @Test
    public void cogeListadodeDosPosiciones(){
        Principal p= new Principal();
        //You can mock concrete classes, not only interfaces
        p.secundaria = mock(Secundaria.class);
        List<String> listado=new ArrayList<String>();
        listado.add("Uno");
        listado.add("Dos");
        //stubbing
        when(p.secundaria.getListado()).thenReturn(listado);
        assertEquals(2, p.secundaria.getListado().size());
    }
    @Test
    public void procesaDatoFunciona(){
        Principal p= new Principal();
        //You can mock concrete classes, not only interfaces
        p.secundaria = mock(Secundaria.class);
        List<String> listado=new ArrayList<String>();
        listado.add("Uno");
        listado.add("Dos");
        //stubbing
        when(p.secundaria.getListado()).thenReturn(listado);
        p.procesaListado();
        assertEquals(3, p.listado.size());
    }
}
