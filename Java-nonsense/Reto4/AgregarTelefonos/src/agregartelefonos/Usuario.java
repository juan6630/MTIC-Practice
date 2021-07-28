/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregartelefonos;

import java.util.*;

/**
 *
 * @author juan6
 */
public class Usuario {
    
    Set<String> Telefonos = new HashSet<String>();
    
    public void addTelefono(String telefono){
        Telefonos.add(telefono);
    }
    
    public void mostrarTelefonos(){
        List<String> SortedTele = new ArrayList<String>(Telefonos);
        Collections.sort(SortedTele);
        System.out.println(SortedTele);
    }
    
}
