package controlador;
import modelo.DB;

public class Main {

    public static void main(String[] args) {
        DB db = new DB();
        ControladorCliente.mostrar();
    }
}