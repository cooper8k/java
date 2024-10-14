/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist;

import java.util.List;

/**
 *
 * @author orlan
 */
public class ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> listaDeMarcas = new java.util.ArrayList<>();
        
        listaDeMarcas.add("kia");
        listaDeMarcas.add("suzuki");
        listaDeMarcas.add("ford");
        listaDeMarcas.add("peugeot");
        listaDeMarcas.add("mclaren");
        
        
        // i pone un nombre arbitrario 
        for (String i : listaDeMarcas) 
        {
            System.out.println(i);
            
        }
        
        listaDeMarcas.remove(0);
        for (String i : listaDeMarcas) 
        {
            System.out.println(i);
            System.out.println(".................");
        }
        
        System.out.println("cantidad de marcas en la lista "+listaDeMarcas.size());
        
        if (listaDeMarcas.contains("suzuki")) 
        {
            System.out.println("la marca esta en la lista");
        } else {
            System.out.println("no esta en la lista");
        }
        System.out.println("3er elemento de la lista"+listaDeMarcas.get(2));
        
        
        listaDeMarcas.clear();
        if (listaDeMarcas.isEmpty()) 
        {
            System.out.println("esta vacia la lista");
        }
        
        
    }
    
}
