/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
/**
 *
 * @author 
 */
public class Pelicula {

    private int codigo;
    private String nombre;
    private float precio;

    public Pelicula(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Pelicula() {
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int val) {
        this.codigo = val;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String val) {
        this.nombre = val;
    }

    public void imprimirEtiqueta() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Pelicula{" + "Codigo=" + codigo + ", Nombre=" + nombre + ", Precio=" + precio + '}';
    }
}
