package micuartaclase;

public class Cuadrado extends Figura {
    private int lado; 

    public int getLado() {
        return lado;
    }

    public Cuadrado() {
    }

    public Cuadrado(int lado, String color) {
        super(color);
        this.lado = lado;
    }

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    @Override
    public void dibujar() { 
        for(int i = 1; i<= lado; i++){
            for(int j = 1; j<= lado; j++) {
                System.out.print(" * ");
            }
            System.out.println(); 
         }
    }
}
