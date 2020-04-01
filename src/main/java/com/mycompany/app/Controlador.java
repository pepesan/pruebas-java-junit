package com.mycompany.app;

public class Controlador {
    private Servicio servicio;
    private String data;
    public Controlador(){
        this.servicio = new Servicio();
        this.data = "";
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
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
        this.data += "!";
    }
}
