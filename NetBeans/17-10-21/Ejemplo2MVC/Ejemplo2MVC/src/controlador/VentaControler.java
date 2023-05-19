/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import vistas.*;

/**
 *
 * @author UTNSISTEMAS
 */
public class VentaControler {
   public static VistaVenta ventana = new VistaVenta();
   
   
   public static void mostrar(){
       ventana.setVisible(true);
   }
   public static void ocultar(){
       ventana.setVisible(false);
   } 
}
