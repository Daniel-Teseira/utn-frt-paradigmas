/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Ubaldo
 */
public class Circulo extends Figura {
    private double radio;
    
    public Circulo(double radio){
        this.radio = radio;
    }
    
    public Circulo (){}
    
    public void setRadio(double radio){
        this.radio = radio;
    }
    
    public double getRadio(){
        return radio;
    }
    
    @Override
    public void calcularArea(){
        setArea(3.14 * (radio * radio));
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + " area=" + super.getArea() + '}';
    }
}
