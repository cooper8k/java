
import java.time.LocalDate;
import java.time.Month;

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
        LocalDate fechaHoy = LocalDate.now();
        LocalDate fechaNacimiento = LocalDate.of(1900, Month.MARCH,20);
        LocalDate fechan = LocalDate.parse("1850-03-23");
        
        
        Alumno alumno1 = new Alumno ("111","lisho",20,fechaNacimiento);
        Docente docente1 = new Docente ("222","carlos","viña",234,fechaHoy);
        Asignatura asignatura1 = new Asignatura ("222","etica",docente1,alumno1, 3.5f , 3.6f ,4.5f);
        
        System.out.println(asignatura1.aprueboAsignatura());
        
        
        int op=0;// lambda
        switch (op) {
            case 1 -> System.out.println("");
            case 2 -> System.out.println("");
            case 3 -> System.out.println("");
            case 4 -> System.out.println("");
  
            default -> System.out.println("");
        }
        
        
    }
}
