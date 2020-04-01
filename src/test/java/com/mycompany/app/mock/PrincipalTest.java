package com.mycompany.app.mock;

import com.mycompany.app.Principal;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;


public class PrincipalTest {
    @Test
    public void secundariaCorrecta(){
        Principal p= new Principal();
        assertNotNull(p.secundaria);
    }
    @Test
    public void listadoCorrecto(){
        Principal p= new Principal();
        assertNotNull(p.listado);
    }


}
