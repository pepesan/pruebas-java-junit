package com.mycompany.app.mock;

import com.sun.javafx.scene.control.skin.VirtualFlow;

import java.util.ArrayList;
import java.util.List;

public class Controlador {
    private Servicio servicio;
    private List<String> data;
    public Controlador(){
        this.servicio = new Servicio();
        this.data = new ArrayList<String>();
    }
    public void list(){
        this.data=this.servicio.getData();
        this.procesaData();
        for (String s: this.data) {
            System.out.println(s);
        }
    }

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public void getServiceData(){
        this.data = this.servicio.getData();
    }
    public void procesaData(){
        this.data.add("!");
    }
}
