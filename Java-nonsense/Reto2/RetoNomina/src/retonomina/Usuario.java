/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retonomina;

/**
 *
 * @author juan6
 */
public class Usuario {
    public String nombre;
    public int identificacion;
    public String email;
    public int edad;
    public String area;
    public boolean es_jefe;
    public double nomina;
    
    public Usuario(String name, int id, String mail, int age, String field, boolean is_boss){
        nombre = name;
        identificacion = id;
        email = mail;
        edad = age;
        area = field;
        es_jefe = is_boss;

//        switch(area)
//        {
//            case "desarrollo":
//                nomina = 4500000;
//                if(es_jefe){
//                    nomina = nomina + 2500000;
//                }
////                break;
//            case "administrativa":
//                nomina = 3500000;
//                if(es_jefe){
//                    nomina += 3000000;
//                }
////                break;
//            default:
//                break;
//        }

        if(area == "desarrollo"){
            if(es_jefe){
                nomina = 7000000;
            } else {
                nomina = 4500000;
            }
        }
        if(area == "administrativa"){
            if(es_jefe){
                nomina = 6500000;
            } else {
                nomina = 3500000;
            }
        }
        
        if(nomina > (908526 * 4)){
            nomina -= ((nomina * 0.01) + (nomina * 0.08));
        } else{
            nomina -= (nomina * 0.08);
        }
    }
    
    public void info(){
        System.out.println("[Usuario]:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Identificacion: " + identificacion);
        System.out.println("Email: " + email);
        System.out.println("Edad: " + edad);
        System.out.println("Área: " + area);
        System.out.println("Salario: " + nomina);
    }
}
