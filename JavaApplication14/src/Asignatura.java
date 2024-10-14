/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orlan
 */
public class Asignatura {
    private String codigo,nombreAsignatura;
    private Docente docente;
    private Alumno alumno;
    private float nota1,nota2,nota3;

    public Asignatura() {
    }

    public Asignatura(String codigo, String nombreAsignatura, Docente docente, Alumno alumno, float nota1, float nota2, float nota3) {
        this.codigo = codigo;
        this.nombreAsignatura = nombreAsignatura;
        this.docente = docente;
        this.alumno = alumno;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
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
        return "Asignatura{" + "codigo=" + codigo + ", nombreAsignatura=" + nombreAsignatura + ", docente=" + docente + ", alumno=" + alumno + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + '}';
    }
    
    public boolean aprueboAsignatura ()
            // snetencia por expresinon
    {
        float promedio =0;
        promedio=(getNota1()+getNota2()+getNota3())/3;
        return promedio >=4;
    }
    
}
