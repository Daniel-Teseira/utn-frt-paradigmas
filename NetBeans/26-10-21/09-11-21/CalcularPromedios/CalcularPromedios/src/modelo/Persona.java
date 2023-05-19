/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Ubaldo
 */
public class Persona {
    private String nombre;
    
    public Persona(){}
    
    public Persona(String nombre){
        this.nombre = nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre = " + nombre + '}';
    }
    
    
    
}
