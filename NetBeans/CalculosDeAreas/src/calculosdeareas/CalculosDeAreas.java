/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculosdeareas;

import java.util.ArrayList;
import modelo.Circulo;
import modelo.Figura;
import modelo.Rectangulo;
import modelo.Triangulo;

/**
 *
 * @author Ubaldo
 */
public class CalculosDeAreas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Figura f1 = new Circulo(3);
        Figura f2 = new Rectangulo(5, 6);
        Figura f3 = new Triangulo(6, 3);
        System.out.println(f1.getClass());
        f1.calcularArea();
        f2.calcularArea();
        f3.calcularArea();
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);

    }

}
