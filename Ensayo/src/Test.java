
import java.util.Scanner;

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
        Scanner leer = new Scanner(System.in);
        int opcion=0;
        Cliente cliente1 = new Cliente ("angel","19447635-3","credito","leche",10);
        
        
        do {
           
        
        System.out.println("................");
        System.out.println("menu");
        System.out.println("1-pagar");
        System.out.println("2-mostrar producto");
        System.out.println("3- mostrar detalle compra");
        System.out.println("4-total a pagar");
        opcion = leer.nextInt();
        
        if (opcion==1){
            cliente1.descuento();
        }
        if (opcion==2){
            cliente1.mostarProducto();
        }
        if (opcion==3) 
        {
            cliente1.mostrarDatosCompra();
        }
        if (opcion==4)
        {
            cliente1.totalPagar();
        }
        } while (true);
    }
}
