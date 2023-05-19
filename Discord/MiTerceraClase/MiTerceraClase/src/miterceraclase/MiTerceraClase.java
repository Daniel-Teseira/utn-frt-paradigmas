package miterceraclase;

public class MiTerceraClase {

    public static void main(String[] args) {
        // Persona p = new Persona(); 
        // p.setNombre("Pepe");
        // p.setEdad(15);
        
        //Ahora con el constructor que hemos agregado
        
        // Persona p = new Persona("Pepe", 15); 
        // System.out.println(p.getNombre() + p.getEdad());
        
        //Ahora de nuevo usamos el método anterior, para probar la clase heredada alumno
        
        //Esto de abajo ya no puedo hacerlo, ahora persona es abstracta
        /*
        
        Persona p = new Persona(); 
        p.setEdad(15);
        p.setNombre("Pepe");
        
        */
        
        //Alumno a = new Alumno();
        
        //a.setNombre("Rodrigo");
        //a.setEdad(16);
        //a.setLegajo(1234); 
        //a.setCarrera("Ingeniería");
        
        //Ahora con el construrctor, puedo hacer esto: 
        
        // Alumno b = new Alumno("Homero", 15, 111, "Sistemas"); 
        
        //a.getNombreyEdad(); 
        //System.out.println(a.getNombreyEdad());
        
        Empleado e = new Empleado("Pepe", 5000);
        e.setEdad(13);
        e.mostrar(); 
    }
    
}
