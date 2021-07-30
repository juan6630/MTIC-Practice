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
public class Producto {
    
    public int id, cantidad;
    public String nombre, categoria;
    public double precio;
    
    public Producto(){
        id = 0;
        nombre = null;
        cantidad = 0;
        categoria = null;
        precio = 0.0;
    }
    
    public Producto(String name, int cantidad, String cat, double price){
        this.nombre = name;
        this.cantidad = cantidad;
        this.categoria = cat;
        this.precio = price;
    }
    
    public void setId(int a){
        this.id = a;
    }
    public void setCantidad(int a){
        this.cantidad = a;
    }
    public void setCategoria(String a){
        this.categoria = a;
    }
    public void setPrecio(double a){
        this.precio = a;
    }
    public void setNombre(String a){
        this.nombre = a;
    }
    
    public int getId(){
        return this.id;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getCantidad(){
        return this.cantidad;
    }
    public String getCategoria(){
        return this.categoria;
    }
    public double getPrecio(){
        return this.precio;
    }
    
    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", cantidad=" + cantidad + ", categoria=" + categoria + ", precio=" + precio + "}";
    }
}
