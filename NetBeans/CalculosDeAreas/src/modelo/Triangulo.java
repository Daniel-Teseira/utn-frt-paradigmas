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
public class Triangulo extends Figura {
    private double base;
    private double altura;
    
    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    public void setBase(double base){
        this.base = base;
    }
    
    public double getBase(){
        return base;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public double getAltura(){
        return altura;
    }
    
    @Override
    public void calcularArea(){
        setArea(base * altura / 2);
    }

    @Override
    public String toString() {
        return "Triangulo{" + "base=" + base + "altura=" + altura + " area=" + super.getArea() + '}';
    }
    
}
