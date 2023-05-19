package controlador;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.DB;
import vista.VistaClientes;

public class ControladorCliente {
    
    static VistaClientes vista = new VistaClientes();
    
    public static void agregarBoton(){
      //int id           = Integer.parseInt(vista.getjTextField1().getText());
      //el codigo no me sirve aca
        String apellido  = vista.getjTextField2().getText();
        String nombre    = vista.getjTextField3().getText();
        int dni          = Integer.parseInt(vista.getjTextField4().getText());
        int celular      = Integer.parseInt(vista.getjTextField5().getText());
        String direccion = vista.getjTextField6().getText();
         
        Cliente c = new Cliente();
        c.setApellido(apellido);
        c.setNombre(nombre);
        c.setDni(dni);
        c.setCelular(celular);
        c.setDireccion(direccion);
         
        DB db = new DB();
        db.agregarCliente(c);
        
        vista.getjTextField1().setText("");
        vista.getjTextField2().setText("");
        vista.getjTextField3().setText("");
        vista.getjTextField4().setText("");
        vista.getjTextField5().setText("");
        vista.getjTextField6().setText("");
        mostrar();
    }
    
    public static void modificarBoton(){
        int id           = Integer.parseInt(vista.getjTextField1().getText());
        String apellido  = vista.getjTextField2().getText();
        String nombre    = vista.getjTextField3().getText();
        int dni          = Integer.parseInt(vista.getjTextField4().getText());
        int celular      = Integer.parseInt(vista.getjTextField5().getText());
        String direccion = vista.getjTextField6().getText();
         
        Cliente c = new Cliente();
        c.setId(id);
        c.setApellido(apellido);
        c.setNombre(nombre);
        c.setDni(dni);
        c.setCelular(celular);
        c.setDireccion(direccion);
         
        DB db = new DB();
        db.modificarCliente(c);
         
        mostrar();
    }
    
    public static void eliminarBoton(){
        //int id = Integer.parseInt(vista.getjTextField1().getText());
         
        DB db = new DB();
        db.eliminarCliente( Integer.parseInt(vista.getjTextField1().getText())/*id*/);
         
        mostrar();
    }

    public static void mostrar(){
       vista.setVisible(true);
       DB db = new DB();
       ArrayList<Cliente> clientes = db.obtenerClientes();
       DefaultTableModel model = (DefaultTableModel) vista.getjTable1().getModel();
       model.setNumRows(0);
       for(Cliente cli : clientes){
           Object[] fila = new Object[6];
           fila[0] = cli.getId();
           fila[1] = cli.getApellido();
           fila[2] = cli.getNombre();
           fila[3] = cli.getDni();
           fila[4] = cli.getCelular();
           fila[5] = cli.getDireccion();
           model.addRow(fila);
       }
   }
}
