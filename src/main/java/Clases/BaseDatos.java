
package Clases;

import java.util.ArrayList;


public class BaseDatos {
    String nombre;
    String descripcion;
    ArrayList<Tabla> tablas;

    public BaseDatos(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    public void addTablas(Tabla tabla){
        tablas.add(tabla);
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
