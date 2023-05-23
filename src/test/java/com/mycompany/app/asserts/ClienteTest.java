package com.mycompany.app.asserts;

import com.mycompany.app.Cliente;
import org.junit.Test;

import java.util.Date;

import static junit.framework.TestCase.assertEquals;

public class ClienteTest {
    @Test
    public void pruebaContructor(){
        Cliente c= new Cliente();
        assertEquals("",c.nombre);
        assertEquals("",c.apellidos);
        assertEquals("",c.dni);
        assertEquals("",c.email);
        Date d= new Date();
        c.setFechaNacimiento(d);
        assertEquals(d,c.fechaNacimiento);
    }
}
