
package miquintaclase;

public class VentaConCheque extends Venta{
    private String banco; 
    private String numeroCheque; 
    
    public VentaConCheque(double monto, String banco, String numero){
        super(monto);
        this.banco=banco; 
        this.numeroCheque = numero; 
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getNumeroCheque() {
        return numeroCheque;
    }

    public void setNumeroCheque(String numeroCheque) {
        this.numeroCheque = numeroCheque;
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("El banco es: " + banco);
        System.out.println("El numero de cheque: " + numeroCheque);
    }
}
