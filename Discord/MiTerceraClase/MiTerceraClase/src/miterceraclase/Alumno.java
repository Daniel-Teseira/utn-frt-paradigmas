package miterceraclase;

//Vamos a usar la herencia para heredar de persona el nombre y la edad

public class Alumno extends Persona {
    private int legajo;
    private String carrera; 
    
    public Alumno(String nombre, int edad, int legajo, String carrera){
        super(); 
        this.legajo = legajo; 
        this.carrera = carrera; 
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
