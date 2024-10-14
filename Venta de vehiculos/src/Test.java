
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
        int op = 0;
        
        
        Cliente cliente1 = new Cliente ("19447635-3","angel orlando prado correa","930258565","angel@gmail.cl","p","12345676");
        Cliente cliente2 = new Cliente ("21099342-2","juan freedy turbina lazo","930342312","freedy@gmail.cl","n","12345674");
        Auto ñuñuki = new Auto("12345676","20km/l en ciudad",1_000_000,150_000,cliente1);
        Auto ñuñuki2 = new Auto("12345675","20km/l en ciudad",1_500_000,150_000,cliente2);
        
        
        do {
            System.out.println("menu de compra");
            System.out.println("1- comprar auto");
            System.out.println("2-modificar el tipo de cliente");
            System.out.println("3-obtener descuento asociado");
            System.out.println("4-total a pagar");
            System.out.println("5-salir");
           op=leer.nextInt();
                   
           
           if (op==1) {
               
           }
            if (op==2) {
                    System.out.println("ingrese a modificar");
                    cliente1.mostrarDatosCliente();
                    String modificacionCliente =leer.next();
                    cliente1.modificarCliente(modificacionCliente);
                    cliente1.mostrarDatosCliente();
                    }
            
            if (op==3){
             ñuñuki.obtenerDescuento(cliente1);
            }
            
            if (op==4) {
            ñuñuki.mantenciones(cliente1);
            }
            if (op==5) {
                System.out.println("saliendo");
                    break;
            }
        } while (op!=5);
        
    }
}