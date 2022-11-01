package Clases;

import java.io.Serializable;
import java.util.ArrayList;

class Rol implements Serializable{
    String nombre;
    ArrayList<Permiso> Permisos;

    
    public Rol(){
    }
    
    public Rol(String nombre) {
        this.nombre = nombre;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public void addPermiso(Permiso permiso){
        Permisos.add(permiso);
    }
    
    
    
}
