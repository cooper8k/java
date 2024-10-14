/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orlan
 */
public class Asignatura {
    private String codASignatura,nombreAsignatura;
    private Alumno alumno;
    private Profesor profesor;
    private float nota1,nota2,nota3;

    public Asignatura() {
    }

    public Asignatura(String codASignatura, String nombreAsignatura, Alumno alumno, Profesor profesor, float nota1, float nota2, float nota3) {
        this.codASignatura = codASignatura;
        this.nombreAsignatura = nombreAsignatura;
        this.alumno = alumno;
        this.profesor = profesor;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getCodASignatura() {
        return codASignatura;
    }

    public void setCodASignatura(String codASignatura) {
        this.codASignatura = codASignatura;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "codASignatura=" + codASignatura + ", nombreAsignatura=" + nombreAsignatura + ", alumno=" + alumno + ", profesor=" + profesor + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + '}';
    }

    
    public void mostrarDatos (){
        float promedio;
        System.out.println("cod asignatura: "+ this.getCodASignatura());
        System.out.println("nombre asignatura: "+this.getNombreAsignatura());
        System.out.println("alumno:" + this.getAlumno().getNombreAlumno());
        System.out.println("profesor: "+this.getProfesor().getNombreDocente());
        System.out.println("nota1: "+this.getNota1()+", nota2:" + this.getNota2()+", nota3: "+this.getNota3());
        
    }
    
    
    public void validarNotas () {
        float promedio,total;
        promedio= (getNota1()+getNota2()+getNota3()) ;
        
        System.out.println("promedio: "+promedio/3);
        total = promedio/3;
        if (total >=4.0) {
            System.out.println("aprovado el ramo");
        } else {
            System.out.println("reprovado el ramo");
        }
    }
}
