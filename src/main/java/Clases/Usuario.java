package Clases;

public class Usuario {
    String id;
    String contrasena;
    String nombre;
    Rol rol;
    
    Usuario(){
    }

    public Usuario(String id, String contrasena, String nombre, Rol rol) {
        this.id = id;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.rol = rol;
    }

    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
    

    
    
}
