/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

/**
 *
 * @author Hugao
 */
public class carro {
    private String marca;
    private String placa;
    private int modelo;

    public carro(){
        marca="";
        placa="";
        modelo=0;
    }

    public void setMarca(String pMarca){
        marca=pMarca;
    }
    
    public void setPlaca(String pPlaca){
        placa=pPlaca;
    }

    public void setModelo(int pModelo){
        modelo=pModelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }
}