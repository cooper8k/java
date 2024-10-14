
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
        Doctor doctor = new Doctor ("19447635","angel","prado",32,"cirugano","diurno");
        Doctor doctor2 = new Doctor ("21354","maria","astudillo",23,"obstetra","nocturno");
        Doctor doctor3 = new Doctor ("34912344","julia","vargas",54,"radiologo","nocturno");
        Scanner leer = new Scanner(System.in);
        int op;
     
        do {
            System.out.println("----- menu-----");
            System.out.println("1-mostar datos");
            System.out.println("2- valdar rut");
            
            op=leer.nextInt();
            if (op==1) 
            {
                doctor.mostrarDatos();
                doctor2.mostrarDatos();
                doctor3.mostrarDatos();
            }
            if (op==2) 
            {
                
            } 
        } while (true);
    }
}
