package com.mycompany.app;


import lombok.Data;

import java.util.Date;

@Data
public class Cliente {
    public String nombre;
    public String apellidos;
    public String dni;
    public String email;
    public Date fechaNacimiento;
    public Cliente(){
        this.nombre="";
        this.apellidos="";
        this.dni="";
        this.email="";
        this.fechaNacimiento= new Date();
    }
}
