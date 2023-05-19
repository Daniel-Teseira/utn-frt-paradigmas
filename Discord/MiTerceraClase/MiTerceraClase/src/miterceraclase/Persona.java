
package miterceraclase;

//Si indico que una clase es abstracta, solo puede tener hijos, pero no puedo crear objetos de esta clase
public abstract class Persona {
    //NO poner nada es lo mismo que decir que hereda de Object: public class Persona extends Object
    private String nombre;
    private int edad; 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getNombreyEdad () {
        return nombre + ", " + edad; 
    }
    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //Hago un constructor vacio para evitar el error en la clase Alumno
    
    public Persona(){
        
    }
    
    public void mostrar(){
        System.out.println("Mi nombre es " + getNombre());
        System.out.println("Mi edad es: " + getEdad());
    }
}
