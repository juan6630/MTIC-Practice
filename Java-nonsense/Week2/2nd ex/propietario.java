/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

/**
 *
 * @author Hugao
 */
public class propietario {
    private String cedula;
    private String nombre;
    private String telefono;
    private String direccion;

    public propietario(){
        cedula="";
        nombre="";
        telefono="";
        direccion="";
    }

    public void setCedula(String pCedula){
        cedula=pCedula;
    }

    public void setNombre(String pNombre){
        nombre=pNombre;
    }

    public void setTelefono(String pTelefono){
        telefono=pTelefono;
    }

    public void setDireccion(String pDireccion){
        direccion=pDireccion;
    }

    public String getCedula() {
        return cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }
}
