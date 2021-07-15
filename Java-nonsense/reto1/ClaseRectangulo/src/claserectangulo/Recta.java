/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claserectangulo;

/**
 *
 * @author juan6
 */
public class Recta {
    public double ancho;
    public double alto;
    
    public void inicializar(double an, double al){
        ancho = an;
        alto = al;
    }
    
    public double calcular_area(){
        return ancho * alto;
    }
    
    public double calcular_perimetro(){
        return (2 * ancho) + (2 * alto);
    }
}
