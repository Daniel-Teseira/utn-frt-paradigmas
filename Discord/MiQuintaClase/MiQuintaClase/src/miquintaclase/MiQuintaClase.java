package miquintaclase;

public class MiQuintaClase {

    public static void main(String[] args) {
        //Fecha f = new Fecha(); 
        //System.out.println(f);
        //println va a usar el toString de Fecha, pero Fecha tiene toString
        //heredado de Object, pot lo que lo sobrescribimos. 
        
        //Venta v = new Venta(200); 
        //v.imprimir();
        
        Caja caja = new Caja(1); 
        caja.agregarVenta(new Venta(200));
        caja.agregarVenta(new VentaConTarjeta(300, "111-222-333")); 
        caja.agregarVenta(new Venta(100));
        caja.agregarVenta(new VentaConCheque(150, "Santander Rio", "12345"));
        
        caja.mostrarVenta(); 
    }
    
}
