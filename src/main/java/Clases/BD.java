
package Clases;

import java.util.ArrayList;


public class BD {
    int id;
    String nombre;
    String descripcion;
    ArrayList<Tabla> tablas;

    public BD() {
    }

    
    
    public BD(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        tablas = new ArrayList<>();
        
    }
    
    public void addTablas(Tabla tabla){
        tablas.add(tabla);
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public ArrayList<Tabla> getTablas() {
        return tablas;
    }

    public void setTablas(ArrayList<Tabla> Tablas) {
        this.tablas = Tablas;
    }
    
    
}
