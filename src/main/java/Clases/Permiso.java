
package Clases;

class Permiso {
    String nombre;
    TipoPermiso tipo;

    public Permiso(String nombre, TipoPermiso tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoPermiso getTipo() {
        return tipo;
    }

    public void setTipo(TipoPermiso tipo) {
        this.tipo = tipo;
    }
    
    
    
}
