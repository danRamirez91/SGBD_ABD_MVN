
package Clases;

import java.util.ArrayList;

public class Tabla {
    
    int id;
    String nombre;
    String descripcion;
    ArrayList<Campo> campos;
    
    public Tabla(){}
    
    public Tabla(String nombre, String descripcion,Campo campo){
        this.nombre = nombre;
        this.descripcion = descripcion;
        campos.add(campo);
    }
    
    public Tabla(String nombre,Campo campo){
        this.nombre = nombre;
        campos.add(campo);
    }

    public Tabla(int id,String nombre, String descripcion,Campo campo) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        campos.add(campo);
    }

    public void addCampo(Campo campo){
        campos.add(campo);
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
    
}
