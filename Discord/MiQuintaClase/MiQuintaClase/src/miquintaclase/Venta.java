package miquintaclase;

public class Venta {
    private Fecha f; 
    private double monto; 
    
    public void imprimir(){
        System.out.println("Fecha: " + f);
        System.out.println("Monto: " + monto);
    }

    public Venta(Fecha f, double monto) {
        this.f = f;
        this.monto = monto;
    }

    public Venta(double monto) {
        this.monto = monto;
        this.f = new Fecha();
    }

    public Venta() {
        this.f = new Fecha(); 
        monto = 0; 
    }

    public Fecha getF() {
        return f;
    }

    public void setF(Fecha f) {
        this.f = f;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    
}
