/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularpromedios;

import controlador.Controlador;
import modelo.Alumno;
import modelo.Alumnos;
import modelo.Materia;

/**
 *
 * @author Ubaldo
 */
public class CalcularPromedios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno(1122,"Rocio Lopez");
        Materia materia1 = new Materia("Algebra", 4);
        Materia materia2 = new Materia("Discreta",10);
        Materia materia3 = new Materia("Paradigmas", 7);
        alumno1.agregarMateria(materia1);
        alumno1.agregarMateria(materia2);
        alumno1.agregarMateria(materia3);
        alumno1.calcularPromedio();

        Alumno alumno2 = new Alumno(1123,"Augusto Rojas");
        Materia materia4 = new Materia("Matematicas", 7);
        Materia materia5 = new Materia("Discreta",9);
        Materia materia6 = new Materia("Paradigmas", 8);
        alumno2.agregarMateria(materia4);
        alumno2.agregarMateria(materia5);
        alumno2.agregarMateria(materia6);
        alumno2.calcularPromedio();
        
        Alumno alumno3 = new Alumno(1124,"Gabriel Fuentes");
        Materia materia7 = new Materia("Ingles", 9);
        Materia materia8 = new Materia("Discreta",8);
        alumno3.agregarMateria(materia7);
        alumno3.agregarMateria(materia8);
        alumno3.calcularPromedio();

        Alumnos alumnos = new Alumnos();
        alumnos.agregarAlumno(alumno1);
        alumnos.agregarAlumno(alumno2);
        alumnos.agregarAlumno(alumno3);
        
        Controlador.inicio(alumnos);
        

        
    }
    
}
