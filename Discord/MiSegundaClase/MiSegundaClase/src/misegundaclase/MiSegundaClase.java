package misegundaclase;

public class MiSegundaClase {

    public static void main(String[] args) {
        Fecha f = new Fecha(); //hacemos una nueva instancia de fecha
        f.setDia(8);  
        f.setMes(6); 
        f.setAño(2020); 
        //f.mes = 20 esto ya no se puede porque los atributos son private 
        System.out.println(f.toString());
        System.out.println(f.getMes()); //Así puedo consultar los valores 
        // privados de la clase

        Persona p = new Persona(); 
        p.setEdad(18); 
        p.setNombre("Toviazs");
        System.out.println(p.getEdad());
        System.out.println(p.getNombre());
    }

}
