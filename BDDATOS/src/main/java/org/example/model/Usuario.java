package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    private int usuario_id;
    private String nombre;
    private String email;
    private byte edad;
    private String passworduser;
    private Date fechaCreacion;
    //Relacion de uno a muchos


    public Usuario(String nombre, String email, byte edad, String passworduser) {
        this.nombre = nombre;
        this.email = email;
        this.edad = edad;
        this.passworduser = passworduser;
    }

    public void printUser(){
        System.out.println("Nombre:"+ nombre);
        System.out.println("Email:"+ email);
        System.out.println("Edad:"+ edad);
    }
}
