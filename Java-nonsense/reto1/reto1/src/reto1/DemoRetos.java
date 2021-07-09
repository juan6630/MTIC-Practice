/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1;

/**
 *
 * @author juan pablo ospina
 */
//public class Reto1 {
//
//    /**
//     * 
//     * @param anios
//     * @param bono
//     * @return 
//     */
//    public static double calcularPorcentajeBono(int anios,float bono) {
//
//        double porcentaje = 5;
//
//        if(anios >= 3 && anios < 5){
//            porcentaje = 10;
//        }
//        if(anios >= 5 && anios < 10){
//            porcentaje = 20;
//        }
//        if(anios >= 10){
//            porcentaje = 30;
//        }
//
//        return porcentaje*bono;
//    }
//    
//}

public class DemoRetos {
    public static double calcularPorcentajeBono(int anios,float bono) {
        double porcentaje = 0.05;

        if(anios >= 3 && anios < 5){
            porcentaje = 0.1;
        }
        if(anios >= 5 && anios < 10){
            porcentaje = 0.2;
        }
        if(anios >= 10){
            porcentaje = 0.3;
        }
        return porcentaje*bono;
    }
}