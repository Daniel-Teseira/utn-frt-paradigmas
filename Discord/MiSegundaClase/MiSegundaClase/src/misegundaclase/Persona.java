package misegundaclase;

public class Persona {
  private int edad; 
  String nombre; 

  public void setEdad(int e) {
    edad = e; 
  }

  public int getEdad(){
    return edad; 
  }

  public String getNombre() {
    return nombre; 
  }

  public void setNombre(String n) {
    //antes de la modif
    nombre = n; 
    //despues de la modif
  }
}