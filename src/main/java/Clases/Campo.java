
package Clases;

import java.io.Serializable;


public class Campo implements Serializable {
    String nombre;
    String descripcion;
    Tipo tipo;
    Dato dato;

    public Campo() {
    }

    public Campo(String nombre, Tipo tipo, Dato dato) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.dato = dato;
    }

    public Campo(String nombre, Tipo tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    
    public Campo(String nombre, String descripcion, Tipo tipo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Dato getDato() {
        return dato;
    }

    public void setDato(Dato dato) {
        this.dato = dato;
    }
    
    
    
    
}
