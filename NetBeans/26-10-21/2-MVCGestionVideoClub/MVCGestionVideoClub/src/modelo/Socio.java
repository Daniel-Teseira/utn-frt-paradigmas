/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
/**
 *
 * @author 
 */
public class Socio extends Persona {

    private int nroCredencial;

    public Socio () {
    }

    public Socio(String nombre, int dni, int nroCredencial) {
        super(nombre, dni);
        this.nroCredencial = nroCredencial;
    }

    public int getNroCredencial () {
        return nroCredencial;
    }

    public void setNroCredencial (int val) {
        this.nroCredencial = val;
    }

    @Override
    public int getDni() {
        return super.getDni(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setDni(int val) {
        super.setDni(val); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNombre() {
        return super.getNombre(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNombre(String val) {
        super.setNombre(val); //To change body of generated methods, choose Tools | Templates.
    }

    public void imprimirCredencial () {
        System.out.println(toString());
    }

    @Override
    public void mostrar () {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Socio{" + super.toString() + ", NroCredencial=" + nroCredencial + '}';
    }

}

