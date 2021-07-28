/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregartelefonos;

/**
 *
 * @author juan6
 */
public class AgregarTelefonos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Usuario u = new Usuario();
        u.addTelefono("333333");
        u.addTelefono("111111");
        u.addTelefono("222222");
        u.addTelefono("444444");
        u.mostrarTelefonos();
    }
    
}
