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
public class ClaseRectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Recta r1 = new Recta();
        Recta r2 = new Recta();
        
        r1.inicializar(20.2, 10.5);
        r2.inicializar(10.4, 10.3);
        
        double area1 = r1.calcular_area();
        double perimetro1 = r1.calcular_perimetro();
        
    }
    
}
