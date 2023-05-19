package micuartaclase;

public abstract class Figura {
    private String color; 
    
    
    //esto ya no, vamos a hacer un método abstracto
    /*
    public void dibujar(){
        //no va a hacer nada a este nivel
        System.out.println("No sé dibujarme"); 
    }
    */
    public abstract void dibujar(); 

    public Figura() {
    }

    public Figura(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
