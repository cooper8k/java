
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orlan
 */
public class test {
    public static void main(String[] args) {
        Familia mama = new Familia ("maria eugenia","prado cortez","123456","01/01/1981",300_000);
        Familia hija1 = new Familia ("maria paz valentina","benavidez prado","2143434","18/05/2005",45_000);
        Familia hija2 = new Familia ("juanita belen ", "benavidez prado","123124324","27/08/2010",0);
        Scanner teclado = new Scanner(System.in);
        int opcion;
        
        System.out.println(mama.toString());
        System.out.println(hija1.toString());
        System.out.println(hija2.toString());
    }
}
