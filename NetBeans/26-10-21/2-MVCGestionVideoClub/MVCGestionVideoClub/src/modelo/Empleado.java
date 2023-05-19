/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
/**
 *
 * @author 
 */

public class Empleado extends Persona {

    private int legajo;
    private String nombreUsuario;
    private String claveAcceso;

    public Empleado () {
    }

    public Empleado(String nombre, int dni, int legajo, String nombreUsuario, String claveAcceso) {
        super(nombre, dni);
        this.legajo = legajo;
        this.nombreUsuario = nombreUsuario;
        this.claveAcceso = claveAcceso;
    }

    public String getClaveAcceso () {
        return claveAcceso;
    }

    public void setClaveAcceso (String val) {
        this.claveAcceso = val;
    }

    public int getLegajo () {
        return legajo;
    }

    public void setLegajo (int val) {
        this.legajo = val;
    }

    public String getNombreUsuario () {
        return nombreUsuario;
    }

    public void setNombreUsuario (String val) {
        this.nombreUsuario = val;
    }

//    public String toString () {
//        return null;
//    }


    public void mostrar () {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Empleado{" + super.toString() + ", Legajo=" + legajo + ", NombreUsuario=" + nombreUsuario + ", ClaveAcceso=" + claveAcceso + '}';
    }

}

