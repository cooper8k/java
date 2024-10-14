/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orlan
 */
public class Test {
    public static void main(String[] args) {
        
        Sumar suma1 = new Sumar(10,20);
        System.out.println("suma"+suma1.operar());
        Restar resta1 = new Restar (100,20);
        System.out.println("resta"+resta1.operar());
        
        
        //operar con sobrecarga 
        System.out.println("sobrecarga suma"+suma1.operar(2.3f, 3.5f));
        System.out.println("sobrecarga resta"+resta1.operar(1.1f, 2.2f));
        
        
        
    }
    
}
