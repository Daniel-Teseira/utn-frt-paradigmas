/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplotabla;

import java.util.ArrayList;

/**
 *
 * @author UTNSISTEMAS
 */
public class DB {
    private ArrayList<Producto> productos = new ArrayList<Producto>();
    
    public void agregar(Producto p){
        productos.add(p);
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
    
}
