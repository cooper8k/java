import java.util.Scanner;
/**
 *
 * @author orlan
 */
public class TestColegio {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
//alumnos        
        Alumno alumno1 = new Alumno("194476353","angel","25","24/02/1997");
        Alumno alumno2 = new Alumno("2343455345","maria","34","14/04/2007");
        Alumno alumno3 = new Alumno("4594434534","leo","45","04/12/1999");
        Alumno alumno4 = new Alumno("213446353","roberto","19","03/11/2004");
// profesores
        Profesor profesor1 = new Profesor("22342","1234412","marta","!2/04/2023","duoc");
        Profesor profesor2 = new Profesor("22341","1321121","juan","!0/11/2022","duoc");
        Profesor profesor3 = new Profesor("22343","1143543","pedro","01/12/2021","duoc");
        Profesor profesor4 = new Profesor("22344","1534232","leyla","07/05/2024","duoc");
//asignaturas
        Asignatura matematicas = new Asignatura("1223","matematicas",alumno1,profesor1,5.4f, 4.3f, 2.5f);
        Asignatura lenguaje = new Asignatura("1224","lenguaje",alumno2,profesor2,5.3f,6.7f,4.6f);
        Asignatura lenguaj2 = new Asignatura("1224","lenguaje",alumno1,profesor2,4.3f,5.7f,4.8f);
        Asignatura ingles = new Asignatura("1225","ingles",alumno3,profesor3,3.1f, 2.3f, 6.5f);
        Asignatura fundamentos = new Asignatura("1226","fundamentos",alumno4,profesor4,3.0f,3.5f,5.4f);

       
        int op = 0;
         do {
             System.out.println("-----------------------------------------------");
             System.out.println("------menu------");
             System.out.println("1-matematicas");
             System.out.println("2-lenguaje");
             System.out.println("3-ingles");
             System.out.println("4-fundamentos");
             System.out.println("5-datos profesor");
             System.out.println("6-datos profesor: ");
             System.out.println("7-salir");
             System.out.println("-----------------------------------------------");
             op = leer.nextInt();
             switch (op) {
                 case 1 -> {
                     matematicas.mostrarDatos();matematicas.validarNotas();
                }
                 case 2 -> {
                     lenguaje.mostrarDatos(); lenguaje.validarNotas();
                     System.out.println("-----------------------------------------------");
                     lenguaj2.mostrarDatos();lenguaj2.validarNotas();
                }
                 case 3 -> {
                     ingles.mostrarDatos();ingles.validarNotas();
                }
                 case 4 -> {
                     fundamentos.mostrarDatos();fundamentos.validarNotas();
                }
                 case 5 -> {
                     System.out.println("-----------------------------------------------");
                     System.out.println("-----------------------------------------------");
                      profesor1.mostararDatosProfesor();
                      System.out.println("-----------------------------------------------");
                      profesor2.mostararDatosProfesor();
                      System.out.println("-----------------------------------------------");
                      profesor3.mostararDatosProfesor();
                      System.out.println("-----------------------------------------------");
                      profesor4.mostararDatosProfesor();
                      System.out.println("-----------------------------------------------");
                 }
                  case 6-> {
                      System.out.println("-----------------------------------------------");
                      System.out.println("-----------------------------------------------");
                     alumno1.mostrarDatosAlumno();
                     System.out.println("-----------------------------------------------");
                     alumno2.mostrarDatosAlumno();
                     System.out.println("-----------------------------------------------");
                     alumno3.mostrarDatosAlumno();
                     System.out.println("-----------------------------------------------");
                     alumno4.mostrarDatosAlumno();
                     System.out.println("-----------------------------------------------");
                  }
                  case 7 -> {
                     System.out.println("saliendo...");
                    
                  }default -> System.out.println("error ingrese un numero correcto");
             }
            
        } while (op!=7);
            
    }

    
}
