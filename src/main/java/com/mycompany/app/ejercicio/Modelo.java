package com.mycompany.app.ejercicio;

import java.util.ArrayList;
import java.util.List;

public class Modelo {
    private List<String> listado;

    public Modelo(){
        listado = new ArrayList<String>();
        listado.add("uno");
        listado.add("dos");
    }
    public List<String> list (){
        return listado;
    }

}
