package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;

public class Secundaria {
    private List<String> listado;
    public Secundaria(){
        this.listado= new ArrayList<String>();
        listado.add("Uno");
        listado.add("Dos");
    }
    public List<String> getListado(){
        return listado;
    }
}
