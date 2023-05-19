package micuartaclase;

public class MiCuartaClase {

    public static void main(String[] args) {
        Cuadrado c = new Cuadrado(10, "rojo"); 
        //c.dibujar();
        
        System.out.println();
        
        Rectangulo r = new Rectangulo(3, 2); 
        //r.dibujar();
        
        System.out.println(); 
        
        TrianguloRectangulo t = new TrianguloRectangulo(4, 6); 
        //t.dibujar(); 
        
        
        //hago un vector para guardar mis figuras
        Figura[] figuras = new Figura[3]; 
        figuras[0] = c; 
        figuras[1] = r; 
        figuras[2] = t; 
        
        for(int i= 0; i<figuras.length; i++){
            Figura f = figuras[i];
            f.dibujar(); 
            System.out.println(); 
        }
    }
    
}
