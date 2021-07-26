/*
 * To change this template, choose Tools | Templates
 
package clases;

/**
 *
 *
 * Este archivo es el contenedor de la clase estudiante,
 * se va a encargar de almacenar las variables que describen
 * el objeto estudiante, y el procedimiento de calcular promedio
 *
 */
public class DatoEstudiante {
    private String nombre;
    private String apellido;
    private String carrera;
    private int edad;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    private double nota5;

    public DatoEstudiante(){
        nombre = "";
        apellido = "";
        carrera = "";
        edad = 0;
        nota1 = 0;
        nota2 = 0;
        nota3 = 0;
        nota4 = 0;
        nota5 = 0;
    }




    /**
     * Metodos Set (Asignación) para cada una de las variables utilizadas.
     *
     * */

    public void setApellido(String pApellido) {
        apellido = pApellido;
    }

    public void setCarrera(String pCarrera) {
        carrera = pCarrera;
    }

    public void setEdad(int pEdad) {
        edad = pEdad;
    }

    public void setNombre(String pNombre) {
        nombre = pNombre;
    }

    public void setNota1(double pNota1) {
        nota1 = pNota1;
    }

    public void setNota2(double pNota2) {
        nota2 = pNota2;
    }

    public void setNota3(double pNota3) {
        nota3 = pNota3;
    }

    public void setNota4(double pNota4) {
        nota4 = pNota4;
    }

    public void setNota5(double pNota5) {
        nota5 = pNota5;
    }

    /**
     * Metodos Get (Obtención) para cada una de las variables utilizadas.
     *
     * */

    public String getApellido() {
        return apellido;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public double getNota5() {
        return nota5;
    }

}
