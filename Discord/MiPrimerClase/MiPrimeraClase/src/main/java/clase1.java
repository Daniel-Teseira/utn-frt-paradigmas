

public class clase1 {
    
    static void dibujar(int []tablero) {
        for (int i=0; i<8; i++) {
           for (int j=0; j<0; j++) {
            if(tablero[i]==j) {
            System.out.print("|R");
        } else {
            System.out.print("|_");
        }
        }
}
        System.out.println();
}

    public static void main(String[] args) {
        int[] tablero = { 0, 1, 2, 3, 4, 5, 6, 7};
        int[] tablero2 = { 0, 0, 0, 0, 0, 0, 0, 0};

        dibujar(tablero);
        dibujar(tablero2);
    }
}
