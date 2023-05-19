/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author UTNSISTEMAS
 */
public class Persona {
    // atributos o carateristicas o variables
    private int dni;
    private String nombre;
    private String telefono;
    
    // contructores sin parametros
    public Persona(){
        
    }
    
    public Persona(int dni, String nombre, String telefono){
        this.dni= dni;
        this.nombre = nombre;
        this.telefono=telefono;
    }
    
    // metodos accesores
    public int getDni(){
        return dni;
    }
    public String getNombre(){
        return nombre;
    }
    public String getTelefono(){
        return telefono;
    }
    
    //metodos mutadores
    public void setDni(int dni){
        this.dni=dni;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
    
    //funcionalidad
    public void alquilar(){
        System.out.println("Persona alquilando");
    }
    
    @Override
    public String toString(){
        return "Persona dni: "+dni+" Nombre: "+nombre+" Telefono: "+telefono;
    }         
}
