package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.*;

public class PersonaTest {
    @Test
    public void iniciaSinNullTest(){
        Persona p = new Persona();
        assertNotEquals(null, p);
    }
    @Test
    public void inciaDatosContructorSinParametrosTest(){
        Persona p = new Persona();
        assertEquals("", p.getNombre());
        assertEquals(0,(long) p.getEdad());
    }
    @Test
    public void inciaDatosContructorConParametrosTest(){
        Persona p = new Persona("Pepe",0);
        assertEquals("Pepe", p.getNombre());
    }
    @Test
    public void getNombreTest(){
        Persona p = new Persona();
        String nombre = p.getNombre();
        assertEquals("", nombre);
    }
    @Test
    public void getNombreConContructorTest(){
        Persona p = new Persona("Pepe",0);
        String nombre = p.getNombre();
        assertEquals("Pepe", nombre);
    }
    @Test
    public void setNombreTest(){
        Persona p = new Persona();
        p.setNombre("Pepe");
        assertEquals("Pepe", p.getNombre());
    }
}
