/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menu;

import java.util.Scanner;

/**
 *
 * @author orlan
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int op =0;
        int x=0;
        
 
        do {
            System.out.println("1 hola");
        System.out.println("2 hol2");
        System.out.println("3 hola3");
        System.out.println("4 hola 4");
        System.out.println("5 chao");
        op = leer.nextInt();
        
        if (op ==1){
            System.out.println("hola numero 1");
            System.out.println("**********************");
        }
        if (op==2){
            System.out.println("hola numero 2");
            System.out.println("**********************");
        }
        if (op==3){
            System.out.println("hola numero 3");
            System.out.println("**********************");
        }
        if (op==4){
            System.out.println("hola numero 4");
            System.out.println("**********************");
        }
        if (op==5) {
            System.out.println("chao n 5");
            System.out.println("**********************");
            break;
        }
        if (op>5 || op <1) {
            System.out.println("ingresa otra vez un numero valido");
            System.out.println("**********************");
        }
        } while (true);
    }
}
