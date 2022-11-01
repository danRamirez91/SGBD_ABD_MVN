package Clases;

import java.io.Serializable;


public class Usuario_BD implements Serializable {
    String BD;
    String usuario;

    public Usuario_BD(String BD, String usuario) {
        this.BD = BD;
        this.usuario = usuario;
    }
    
    
}
