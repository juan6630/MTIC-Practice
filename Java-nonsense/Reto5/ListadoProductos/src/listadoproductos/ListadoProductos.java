/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadoproductos;

/**
 *
 * @author juan6
 */
public class ListadoProductos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Producto p = new Producto();
        //Producto p = new Producto("Jabon", 50, "Aseo", 2000);
        
        Producto p = new Producto();
        p.setId(6);
        p.setCantidad(10);
        p.setCategoria("Aseo");
        p.setPrecio(4000);
        p.setNombre("Seda dental");
        
        System.out.println(p.toString());
    }
    
}
