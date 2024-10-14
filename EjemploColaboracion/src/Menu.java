
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author orlan
 */
public class Menu {
    public static void main(String[] args) {
        
        boolean tiene;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("---ingreso director---");
        System.out.println("ingrese nombre");
        String nombre = leer.next();
        System.out.println("ingrese edad");
        int edad = leer.nextInt();
        System.out.println("ingrese si tiene oscar");
        String oscar = leer.next();
        
        
        if (oscar.equalsIgnoreCase("si")) {
            tiene =true;
        }else{
            tiene = false;
        
        }
        System.out.println("ingrese cantidad de peliculas ");
        int cantidad = leer.nextInt();
        
        
        
        
        
        
        Director objDir = new Director ("geoge lucas",80,true,12);
        Pelicula onjPel = new Pelicula (1997,"star wars","ficcion",2.30,objDir);
        
        
        System.out.println(objDir.toString());
        System.out.println(onjPel.toString());
    }
}
