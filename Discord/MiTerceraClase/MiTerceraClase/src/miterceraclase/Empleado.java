package miterceraclase;

public class Empleado extends Persona{
    private double sueldo; 

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    public Empleado(String nombre, double sueldo){
        setNombre(nombre);
        setSueldo(sueldo); 
    }
    
    @Override
    public void mostrar(){
        super.mostrar(); 
        System.out.println("Mi sueldo es: " + getSueldo());
        //Estoy sobreescribiendo el mostrar que heredo de la clase Persona
    }
}
