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
public abstract class Figura {
    private double area;
    
    public Figura(){}
    
    public void setArea(double area){
        this.area = area;
    }
    
    public double getArea(){
        return area;
    }
    
    public abstract void calcularArea();

    @Override
    public String toString() {
        return "Figuras{" + "area=" + area + '}';
    }
    
}
