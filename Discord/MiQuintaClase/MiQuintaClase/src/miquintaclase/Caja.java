package miquintaclase;
import java.util.ArrayList; 

public class Caja {
    private int numero; 
    private ArrayList<Venta> ventas = new ArrayList(); 

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }
    
    public Caja(int numero) { 
        this.numero = numero; 
    }
    
    public void agregarVenta(Venta v){
        ventas.add(v); 
    }
    
    public void mostrarVenta(){
        double total = 0; 
        for(int i = 0; i < ventas.size(); i++){
            ventas.get(i).imprimir();
            total+=ventas.get(i).getMonto(); 
            System.out.println(); 
        }
        
        System.out.println("Total de ventas del dia: " + total); 
    }
}
