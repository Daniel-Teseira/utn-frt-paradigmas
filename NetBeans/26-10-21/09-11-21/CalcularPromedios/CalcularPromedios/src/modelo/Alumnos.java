/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.util.ArrayList;

/**
 *
 * @author Ubaldo
 */
public class Alumnos {
    private ArrayList<Alumno> alumnos = new ArrayList<>();
    
    public Alumnos(){}

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public void agregarAlumno(Alumno alumno){
        alumnos.add(alumno);
    }
    
    @Override
    public String toString() {
        return "Alumnos{" + " alumnos = " + alumnos + '}';
    }

    
    
}
