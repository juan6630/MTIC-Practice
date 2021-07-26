/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import clases.estudiante;
import interfaces.interfazEstudiante;
import javax.swing.JOptionPane;

/**
 *
 * @author Hugao
 */
public class mainConInterfaz {

    /**
     * Clase Main del programa se encarga de interactuar con el usuario
     */
    public static void main(String[] args) {
        int opc;
        interfazEstudiante ie = new interfazEstudiante();  //instancia un objeto de la clase interfazEstudiante
        estudiante est = new estudiante(); //instancia un objeto de la clase estudiante
        String menu="1. Crear Estudiante\n" +
                    "2. Calcular Promedio\n" +
                    "0. Salir"; //Menú de la Aplicación
        do{
            opc=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Opción que Desea\n"+menu));
            //Ingreso de la opción del menú
            switch(opc){
               case 1: est = ie.capturarEstudiante();  //capturar los datos usando la interfazEstudiante
                       break;
               case 2: JOptionPane.showMessageDialog(null,ie.calcularPromedio(est));
                       //Mostrar datos del estudiante y promedio usando nuevamente la interfazEstudiante
                       break;
            }
        }while(opc!=0);
    }

}
