package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public Secundaria secundaria;
    public List<String> listado;
    public Principal(){
        this.secundaria= new Secundaria();
        this.listado= new ArrayList<String>();
    }
    public void cogeListado(){
        this.listado=secundaria.getListado();
    }
    public void procesaListado(){
        this.cogeListado();
        this.listado.add("Tres");
    }
}
