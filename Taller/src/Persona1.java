/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orlan
 */
public class Persona1 {
    public static void main(String[] args) {
        
        // instancia la clave
        
        Persona persona1 = new Persona("angel",27,1.7f);
        
        System.out.println(persona1);        
        persona1.validadEdad();
        persona1.premio();
        
        Persona per2 =new Persona("javi",14,1.6f);
        System.out.println(per2);
        per2.validadEdad();
        per2.premio();
    }
    
}
