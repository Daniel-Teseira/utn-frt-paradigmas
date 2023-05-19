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
public class Alumno extends Persona{
    private int legajo;
    private ArrayList<Materia> materias = new ArrayList<>();
    private float promedio;
    
    public Alumno(){}
    
    public Alumno(int legajo, String nombre){
        super(nombre);
        this.legajo = legajo;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }
    
    public void agregarMateria(Materia materia){
        materias.add(materia);
    }
    
    public void calcularPromedio(){
        float suma = 0;
        for(Materia m : materias){
            suma += m.getNota();
        }
        promedio = suma / materias.size();
    }

    @Override
    public String toString() {
        return "Alumno{ Nombre = " + super.getNombre() + " legajo = " + legajo + ", materias = " + materias + ", promedio = " + promedio + '}';
    }
    
    
}
