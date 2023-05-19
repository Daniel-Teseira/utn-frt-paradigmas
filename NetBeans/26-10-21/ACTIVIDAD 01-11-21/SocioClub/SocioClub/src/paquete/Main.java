/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//package paquete;
package paquete;
/**
 *
 * @author 
 */

import vista.PantallaPrincipal;

/**
 *
 * @author keniobats
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PantallaPrincipal vista = new PantallaPrincipal();
        vista.GestionarSocio vista = new vista.GestionarSocio();
        vista.setVisible(true);
    }
}
