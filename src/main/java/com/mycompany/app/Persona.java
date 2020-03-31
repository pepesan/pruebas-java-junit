package com.mycompany.app;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class Persona {
    private String nombre;
    private Integer edad;
    Persona(){
        this.nombre = "";
        this.edad = 0;
    }


}
