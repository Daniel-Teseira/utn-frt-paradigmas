/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author 
 */
public class Persona {

    private String nombre;

    private int dni;

    public Persona () {
    }
    
    public Persona(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public int getDni () {
        return dni;
    }

    public void setDni (int val) {
        this.dni = val;
    }

    public String getNombre () {
        return nombre;
    }

    public void setNombre (String val) {
        this.nombre = val;
    }

    public void mostrar () {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + nombre + ", Dni=" + dni + '}';
    }


}