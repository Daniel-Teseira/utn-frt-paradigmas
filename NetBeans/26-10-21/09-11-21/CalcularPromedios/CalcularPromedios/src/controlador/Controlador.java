/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Alumno;
import modelo.Alumnos;
import modelo.Materia;
import vista.Pantalla;
import vista.PantallaAgregarAlumno;

/**
 * JOptionPane.showMessageDialog(vista, "mensaje", "Mensaje de validacion", JOptionPane.INFORMATION_MESSAGE);

 * int n = JOptionPane.showConfirmDialog(vista, "Esta seguro de Borrar ?", "Mensaje de Confirmación", JOptionPane.YES_NO_OPTION);
 * if (n == JOptionPane.YES_OPTION) {
 
 * try{
 * 
 * } catch (Exception){
 * 
 * }
 * @author Ubaldo
 */
public class Controlador {
    private static Alumnos alumnos;
    private static int idx = 0;
    private static Pantalla pantalla;
    
    public static void inicio(Alumnos alu){
        alumnos = alu;
        pantalla = new Pantalla();
        pantalla.setVisible(true);
        Controlador.mostrarAlumno();
    }

    public static void mostrarAlumno(){
        pantalla.getLegajo().setText(String.valueOf(alumnos.getAlumnos().get(idx).getLegajo()));
        pantalla.getNombre().setText(alumnos.getAlumnos().get(idx).getNombre());
        pantalla.getPromedio().setText(String.valueOf(alumnos.getAlumnos().get(idx).getPromedio()));

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnCount(0);
        modelo.setNumRows(0);
        modelo.addColumn("Nombre de Materia");
        modelo.addColumn("Nota");
        for (Materia materia : alumnos.getAlumnos().get(idx).getMaterias()) {
            Object[] fila = new Object[2];
            fila[0] = materia.getNombre();
            fila[1] = materia.getNota();
            modelo.addRow(fila);
        }
        pantalla.getTablaMaterias().setModel(modelo);
        pantalla.getTablaMaterias().getColumnModel().getColumn(0).setPreferredWidth(150);
        pantalla.getTablaMaterias().getColumnModel().getColumn(1).setPreferredWidth(50);

    }
    
    public static void siguiente(Pantalla pantalla){
        if(idx == alumnos.getAlumnos().size() - 1){
            idx = 0;
        }else{
            idx++;
        }
        Controlador.mostrarAlumno();
    }

    public static void anterior(Pantalla pantalla){
        if(idx == 0){
            idx = alumnos.getAlumnos().size() - 1;
        }else{
            idx--;
        }
        Controlador.mostrarAlumno();        
    }
    
    public static void agregarAlumno(Pantalla vista){
        PantallaAgregarAlumno pantallaAA = new PantallaAgregarAlumno(new javax.swing.JFrame(), true);
        pantallaAA.getTitulo().setText("Agrega Alumno");
        pantallaAA.setVisible(true);
        do{
            if(pantallaAA.getBandera() == 1){
                Alumno alumno = new Alumno();
                alumno.setLegajo(Integer.valueOf(pantallaAA.getLegajo().getText()));
                alumno.setNombre(pantallaAA.getNombre().getText());
                alumnos.agregarAlumno(alumno);
            }
            break;
        }while(true);
    }

    public static void borrarAlumno(Pantalla vista){
        int n = JOptionPane.showConfirmDialog(vista, "Esta seguro de Borrar ?", "Mensaje de Confirmación", JOptionPane.YES_NO_OPTION);
        if (n == JOptionPane.YES_OPTION) {
            alumnos.getAlumnos().remove(alumnos.getAlumnos().get(idx));
            idx = 0;
            Controlador.mostrarAlumno();        
        }    
    }
    public static void modificarAlumno(Pantalla vista){
        PantallaAgregarAlumno pantallaAA = new PantallaAgregarAlumno(new javax.swing.JFrame(), true);
        pantallaAA.getTitulo().setText("Modifica Alumno");
        pantallaAA.getLegajo().setText(String.valueOf(alumnos.getAlumnos().get(idx).getLegajo()));
        pantallaAA.getNombre().setText(alumnos.getAlumnos().get(idx).getNombre());
        pantallaAA.setVisible(true);
        do{
            if(pantallaAA.getBandera() == 1){
                alumnos.getAlumnos().get(idx).setLegajo(Integer.valueOf(pantallaAA.getLegajo().getText()));
                alumnos.getAlumnos().get(idx).setNombre(pantallaAA.getNombre().getText());
            }
            break;
        }while(true);
        Controlador.mostrarAlumno();        
    }
    
    public static void salir(Pantalla vista){
        vista.dispose();
    }

}
