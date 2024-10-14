

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orlan
 */
public class MenuEscuela {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno ("angel","19447635-3","basico","futbol",12354, (float) 4.5);
        Apoderado apoderado1 = new Apoderado ("maribel","9924696-0","pac","angel",12354,3);
        Scanner leer = new Scanner(System.in);
        int op=0;
        
        do {
            System.out.println("**********************");
            System.out.println("menu escuela");
            System.out.println("1- MOSTRAR DATOS alumno ");
            System.out.println("2- datos apoderado");
            System.out.println("3 validar id alumno,apoderado");
            System.out.println("4-descuento y total a pagar");
            System.out.println("**********************"); 
            op=leer.nextInt();
            if (op==1){
                System.out.println("mostar datos alumnos");
                alumno1.mostrarDatos();
            }
            if (op==2)
            {
                System.out.println("datos apoderado");
                apoderado1.mostrarDatos();
            }
            if (op==3) 
            {
                System.out.println("validacion id");
                alumno1.validadId(alumno1, apoderado1);
            }
            if (op ==4) 
            {
                System.out.println("obtencion descuento");
                apoderado1.descuento();
                apoderado1.totalPagar();
            }
            
        } while (true);
    }

    
}
