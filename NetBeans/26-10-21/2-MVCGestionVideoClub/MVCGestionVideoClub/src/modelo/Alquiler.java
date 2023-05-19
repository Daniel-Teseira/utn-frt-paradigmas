/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
/**
 *
 * @author 
 */

import java.util.ArrayList;

public class Alquiler {

    private Fecha fechaAlquiler;
    private Fecha fechaDevolucion;
    private Empleado mEmpleado;
    private Socio mSocio;
    private ArrayList<Pelicula> mPelicula;

    public Alquiler() {
    }

    public Alquiler(int diaa, int mesa, int anioa, int diad, int mesd, int aniod, Empleado mEmpleado, Socio mSocio) {
        this.fechaAlquiler = new Fecha(diaa, mesa, anioa);
        this.fechaDevolucion = new Fecha(diad, mesd, aniod);
        this.mEmpleado = mEmpleado;
        this.mSocio = mSocio;
        mPelicula = new ArrayList<>();
    }

    public Fecha getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Fecha val) {
        this.fechaAlquiler = val;
    }

    public Fecha getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Fecha val) {
        this.fechaDevolucion = val;
    }

    public Empleado getEmpleado() {
        return mEmpleado;
    }

    public void setEmpleado(Empleado val) {
        this.mEmpleado = val;
    }

    public ArrayList<Pelicula> getmPelicula() {
        return mPelicula;
    }

    public void setmPelicula(ArrayList<Pelicula> mPelicula) {
        this.mPelicula = mPelicula;
    }

    public Socio getSocio() {
        return mSocio;
    }

    public void setSocio(Socio val) {
        this.mSocio = val;
    }

    public void agregarPeliculas(Pelicula p) {
        mPelicula.add(p);
    }

    public void eliminarPeliculas(Pelicula p) {
        mPelicula.remove(p);
    }

    @Override
    public String toString() {
        return "Alquiler{" + ", FechaAlquiler=" + fechaAlquiler
                + ", FechaDevolucion=" + fechaDevolucion + ", Empleado=" + mEmpleado
                + ", Socio=" + mSocio + ", Pelicula=" + mPelicula + '}';
    }
}
