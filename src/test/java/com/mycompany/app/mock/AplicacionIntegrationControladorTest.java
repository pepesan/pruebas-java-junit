package com.mycompany.app.mock;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;

public class AplicacionIntegrationControladorTest {
    @Mock
    private Controlador controlador;
    @Before
    public void initMocks() {
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void llamaAControladorList(){
        controlador.list();
        verify(controlador, atLeastOnce()).list();
    }
}
