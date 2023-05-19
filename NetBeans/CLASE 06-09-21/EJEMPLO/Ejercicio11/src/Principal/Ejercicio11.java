/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import modelo.Persona;

/**
 *
 * @author UTNSISTEMAS
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona a = new Persona();
        a.setDni(22222222);
        a.setNombre("Pedro");
        a.setTelefono("1555555555");
        
        System.out.println(a.toString());
        
        Persona b = new Persona(34563333,"Maria", "15444444");
         System.out.println(b.toString());
    }
    
}
