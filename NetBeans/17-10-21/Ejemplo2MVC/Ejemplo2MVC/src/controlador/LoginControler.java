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
public class LoginControler {

    public static VentanaLogin v = new VentanaLogin();

    public static void mostrar() {
        v.setVisible(true);
    }

    public static void ocultar() {
        v.setVisible(false);
    }
    
    public static void enventoBoton1(){
        System.out.println("Evento...");
        String usuario = v.getjTextField1().getText();
        String clave = v.getjTextField2().getText();
        
        if(usuario.equals("admin")&&clave.equals("1234")){
            ocultar();
            PrincipalControler.mostrar();
        }else{
            System.out.println("Usuario o clave incorrecta");
        }
    }
}
