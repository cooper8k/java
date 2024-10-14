/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vina
 */
public class Test {
    public static void main(String[] args) {
        
        Alumno alumno1 = new Alumno("Alan Brito",10,1f);
        Alumno alumno2 = new Alumno("Juan PriEto",12,1.5f);
        Alumno alumno3 = new Alumno("PEDRO PE",15,1.6f);
        Curso curso1 = new Curso(5,"s",alumno1, alumno2, alumno3);
        
        System.out.println(curso1.toString());
    }
    
}
