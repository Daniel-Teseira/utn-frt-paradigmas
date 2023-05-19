package misegundaclase;

public class Fecha {
  private int dia; 
  private int mes; 
  private int año;
  
  public void setDia(int d) {
   dia = d; 
  }

  public void setMes(int m) {
    if(m >= 1 && m <= 12) {
    mes = m; 
    }
    else{
    System.out.println("Mes incorrecto, no fue cambiado"); 
} 
    
  }

  public void setAño(int a) {
    año = a; 
  }
  
  public String toString(){ //Esto como que no lo explica viste
    return dia + "/" + mes + "/" + año; 
  }

  public int getDia() {
    return dia; 
  }

  public int getMes() {
    return mes; 
  }

  public int getAño() {
    return año; 
  }
}
