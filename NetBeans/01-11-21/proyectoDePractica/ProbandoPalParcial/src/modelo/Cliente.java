package modelo;

public class Cliente {
    private int id, dni, celular;
    private String apellido, nombre, direccion;

    /////////////////////GETTERS Y SETTERS//////////////////////////////////////
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public int getCelular() {
        return celular;
    }
    public void setCelular(int celular) {
        this.celular = celular;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    ///////////////////////CONSTRUCTORES////////////////////////////////////////
    
    public Cliente() {
    }
    public Cliente(int id, String apellido, String nombre, int dni, int celular, String direccion) {
        this.id = id;
        this.dni = dni;
        this.celular = celular;
        this.apellido = apellido;
        this.nombre = nombre;
        this.direccion = direccion;
    }
    ////////////////////////TOSTRING//////////////////////////////////////
    
    @Override
    public String toString() {
        return "Cliente{ id=" + id + ", dni=" + dni + ", celular=" + celular + ", apellido=" + apellido + ", nombre=" + nombre + ", direccion=" + direccion + '}';
    }
    
    ////////////////////////////////////////////////////////////////////////////

}