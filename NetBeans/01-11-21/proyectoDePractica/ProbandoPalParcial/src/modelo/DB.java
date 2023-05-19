package modelo;
import java.sql.*;
import java.util.ArrayList;

public class DB {
    Connection conexion;
    String cadenaConexion = "jdbc:mysql://localhost/gestiónnegocio?serverTimezone=UTC";
    String usuario = "root";
    String clave = "root";
    
    public DB(){
        try{
            conexion = DriverManager.getConnection(cadenaConexion, usuario, clave);
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
        }        
    }
    
    public void agregarCliente(Cliente cliente){
        try{
            PreparedStatement s = conexion.prepareStatement(
            "INSERT INTO clientes (apellido,nombre,dni,celular,direccion) VALUES(?,?,?,?,?)");
            
            s.setString(1, cliente.getApellido());
            s.setString(2, cliente.getNombre());
            s.setInt(3, cliente.getDni());
            s.setInt(4, cliente.getCelular());
            s.setString(5, cliente.getDireccion());
            
            s.executeUpdate();
        } catch (Exception e){
            System.out.println(e);
        }
    }
    
    public void modificarCliente(Cliente cliente){
        try{
            PreparedStatement s = conexion.prepareStatement(
            "UPDATE clientes SET apellido=?, nombre=?, dni=?, celular=?, direccion=? WHERE id=?");
            
            s.setString(1, cliente.getApellido());
            s.setString(2, cliente.getNombre());
            s.setInt(3, cliente.getDni());
            s.setInt(4, cliente.getCelular());
            s.setString(5, cliente.getDireccion());
            s.setInt(6, cliente.getId());
            
            s.executeUpdate();
        } catch (Exception e){
            System.out.println(e);
        }
    }
    
    public void eliminarCliente(int codigo){
        try{
            PreparedStatement s = conexion.prepareStatement(
            "DELETE FROM clientes WHERE id=" + codigo);
            
            s.executeUpdate();
        } catch (Exception e){
            System.out.println(e);
        }
    }
    
    public ArrayList<Cliente> obtenerClientes(){
        ArrayList<Cliente> lista = new ArrayList<>();
        
        try{
            Statement s = conexion.createStatement();
            ResultSet res = s.executeQuery("SELECT * FROM clientes ORDER BY apellido");
            while (res.next()){
                
                Cliente c = new Cliente( 
                        res.getInt("id"),
                        res.getString("apellido"),
                        res.getString("nombre"),
                        res.getInt("dni"),
                        res.getInt("celular"),
                        res.getString("direccion"));
                lista.add(c);
            }
        } catch (Exception e){
            System.out.println(e);
        }
        return lista;
    }
}