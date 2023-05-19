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
public class PrincipalControler {
   public static VistaPrincipal ventana = new VistaPrincipal();
   
   
   public static void mostrar(){
       ventana.setVisible(true);
   }
   public static void ocultar(){
       ventana.setVisible(false);
   }    
   
   public static void botonSalir(){
       ocultar();
       LoginControler.mostrar();
   }
   
   public static void botonVenta(){
       ocultar();
       VentaControler.mostrar();
   }
    
}
