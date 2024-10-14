/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica;

/**
 *
 * @author orlan
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Familia papa = new Familia ("fernando","923487","papa",65);
        Familia mama = new Familia ("maribel","9024696","mama",60);
        Familia hijo1 = new Familia ("gerardo","1763663","hijo mayor",33);
        Familia hijo2 = new Familia ("fernanda","1893873","hija del medio",30);
        Familia hijo3 = new Familia ("angel","19447635","hijo menor",27);
        Familia nieto1 = new Familia ("benjamin","23234444","nieto",11);
        Familia nieto2 = new Familia ("isabella","324234","nieta",3);
        
        
        System.out.println(papa.toString());
        System.out.println(mama.toString());
        System.out.println(hijo1.toString());
        System.out.println(hijo2.toString());
        System.out.println(hijo3.toString());
        System.out.println(nieto1.toString());
        System.out.println(nieto2.toString());
    } 
}
