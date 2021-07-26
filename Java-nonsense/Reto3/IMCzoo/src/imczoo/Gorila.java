/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imczoo;

/**
 *
 * @author juan6
 */
public class Gorila extends Animal {
    public Gorila(double peso, double altura){
        this.peso = peso;
        this.altura = altura;
    }
    
    public double getPesoAlims(){
        Alimento[] alimentos = getAlimsIngeridos();
        double alim_total = alimentos[0].getGramos()+ alimentos[1].getGramos() + alimentos[2].getGramos();
        return Math.floor(alim_total);
    }
    
    public double getIMC(){
        return (getPeso() + (getPesoAlims()/1000)) / Math.pow(getAltura(), 2);
    }
}
