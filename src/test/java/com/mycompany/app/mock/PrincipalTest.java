package com.mycompany.app.mock;

import com.mycompany.app.Principal;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;


public class PrincipalTest {
    Principal p;
    @Before
    public void antes (){
        this.p= new Principal();
    }
    @Test
    public void secundariaCorrecta(){
        assertNotNull(p.secundaria);
    }
    @Test
    public void listadoCorrecto(){
        assertNotNull(p.listado);
    }


}
