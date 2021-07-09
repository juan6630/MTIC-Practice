/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package six.month.app;

import java.util.Scanner;

/**
 *
 * @author juan6
 */
public class SixMonthApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner r = new Scanner(System.in);

        int sucursales, meses;
        
        System.out.println("Ingrese la cantidad de sucursales:  ");
        sucursales = r.nextInt();
        System.out.println("Ingrese la cantidad de meses:   ");
        meses = r.nextInt();
        
        float[][] matrix = new float[sucursales][meses];
        float[] total_personas = new float[sucursales];
        float[] solution1 = new float[2];
        float[] total_mes = new float[meses];
        float[] solution2 = new float[2];
        float[] mayor_valor = new float[3];
        
        for(int i=0; i<sucursales; i++){
            for(int j=0; j<meses; j++){
                System.out.printf("Ingrese el dato de la sucursal %d en el mes %d:  ", i+1,j+1);
                matrix[i][j] = r.nextFloat();
            }
        }
        
        //Sucursal con mayor ingreso de personas P1
        for(int k=0; k<sucursales; k++){
            total_personas[k] = 0;
            for(int x=0; x<meses; x++){
                total_personas[k] += matrix[k][x];
            }
//            System.out.printf("Total de la sucursal %d es %1.1f%n", k+1,total_personas[k]);
        }
        solution1[0] = 0;
        solution1[1] = total_personas[0];
        for(int i=1; i<sucursales;i++){
            if(solution1[1] < total_personas[i]){
                solution1[0] = i;
                solution1[1] = total_personas[i];
            }
        }
        System.out.printf("La sucursal con mayor ingreso de personas fue %5.0f con %5.1f comensales%n", solution1[0]+1,solution1[1]);
        
        //Mes con menor cantidad de comensales P2
        for(int i=0;i<meses;i++){
            total_mes[i] = 0;
            for(int j=0;j<sucursales;j++){
                total_mes[i] += matrix[j][i];
            }
        }
        solution2[0] = 0;
        solution2[1] = total_mes[0];
        for(int k=1;k<meses;k++){
            if(solution2[1] > total_mes[k]){
                solution2[0] = k;
                solution2[1] = total_mes[k];
            }
        }
        //TODO número del mes a palabra
        System.out.printf("El mes con menor cantidad de comensales fue %1.0f con %5.1f comensales%n", solution2[0]+1,solution2[1]);
        
        //Valor más alto y en que sucursal y mes fue
        mayor_valor[0] = 0;
        for(int i=0;i<sucursales;i++){
            for(int j=0;j<meses;j++){
                if(matrix[i][j] > mayor_valor[0]){
                    mayor_valor[0] = matrix[i][j];
                    mayor_valor[1] = i+1;
                    mayor_valor[2] = j+1;
                }
            }
        }
        System.out.printf("El mayor número de asistentes fue %1.0f en la sucursal %1.0f y el mes %1.0f%n", mayor_valor[0], mayor_valor[1], mayor_valor[2]);
        
    }
    
}
