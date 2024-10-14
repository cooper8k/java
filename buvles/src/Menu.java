
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
        Scanner teclado = new Scanner (System.in);
        int op = 0;
        op = teclado.nextInt();
        do {
            System.out.println("hola");
            op = teclado.nextInt();
        } while (op!=5);
        
    }

}
