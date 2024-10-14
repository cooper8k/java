/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buvles;
import java.util.Scanner;
/**
 *
 * @author vina
 */
public class Buvles {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        // bucle for       
//        for (int i =0; i < 11; i++){
//        
//            System.out.println(i);
//        
//        }
            //        int i=0;
            
        // bucle while
//        while (i<10) {
//           i++;
//           System.out.println(i);
        // }
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("menu");
            System.out.println("1- guardar ");
            System.out.println("2- mostrar ");
            System.out.println("0- salir ");
            System.out.println("seleccione opcion  ");
            opcion= teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("menu guardar");
                    break;
                    
                case 2:
                    System.out.println("menu mostrar");
                    break;
                default:
                    System.out.println("opcion invalida");
            }
        } while (opcion!=0);
            System.out.println("salio menu");
        
          
    
    
    }


}
