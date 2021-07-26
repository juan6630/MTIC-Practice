/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaces;

import clases.estudiante;
import javax.swing.JOptionPane;

/**
 *
 * Interfaz que se encarga de manipular los datos de la clase y entregarlos
 * al Main de la aplicación como un objeto.
 *
 * @author Hugao
 */
public class interfazEstudiante {

    /**
     *
     * Esta Función se encarga de generar un objeto de tipo estudiante con sus datos partiendo de cero
     * y de retornarselo a la clase Main del programa
     *
     */
    public estudiante capturarEstudiante(){
        estudiante est = new estudiante();
        est.setNombre(JOptionPane.showInputDialog("Nombre del Estudiante:"));
        est.setApellido(JOptionPane.showInputDialog("Apellido del Estudiante:"));
        est.setCarrera(JOptionPane.showInputDialog("Carrera del Estudiante:"));
        est.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Edad del Estudiante:")));
        est.setNota1(Double.parseDouble(JOptionPane.showInputDialog("Nota 1 del Estudiante")));
        est.setNota2(Double.parseDouble(JOptionPane.showInputDialog("Nota 2 del Estudiante")));
        est.setNota3(Double.parseDouble(JOptionPane.showInputDialog("Nota 3 del Estudiante")));
        est.setNota4(Double.parseDouble(JOptionPane.showInputDialog("Nota 4 del Estudiante")));
        est.setNota5(Double.parseDouble(JOptionPane.showInputDialog("Nota 5 del Estudiante")));
        return est;
    }

    /**
     *
     * Esta función se encarga de recibir un estudiante y formar un cuadro con sus respectivos datos
     * y el calculo de su promedio, según las notas ingresadas.
     *
     */

    public String calcularPromedio(estudiante est){
        double suma,promedio;
        String mensaje;
        suma = est.getNota1()+est.getNota2()+est.getNota3()+est.getNota4()+est.getNota5();
        promedio = suma/5;
        mensaje="Estudiante: "+est.getNombre()+" "+est.getApellido()+"\n" +
                "Edad: "+est.getEdad()+"\n" +
                "Carrera: "+est.getCarrera()+"\n" +
                "Promedio: "+promedio;
        return mensaje;
    }

}
