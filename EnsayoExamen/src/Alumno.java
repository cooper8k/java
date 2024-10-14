/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orlan
 */
public class Alumno {
    private String nombreAlumno,rut,nivelIngles,tallerDeporte;
    private int idAlumno;
    private float promedioNotas;

    public Alumno() {
    }

    public Alumno(String nombreAlumno, String rut, String nivelIngles, String tallerDeporte, int idAlumno, float promedioNotas) {
        this.nombreAlumno = nombreAlumno;
        this.rut = rut;
        this.nivelIngles = nivelIngles;
        this.tallerDeporte = tallerDeporte;
        this.idAlumno = idAlumno;
        this.promedioNotas = promedioNotas;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNivelIngles() {
        return nivelIngles;
    }

    public void setNivelIngles(String nivelIngles) {
        this.nivelIngles = nivelIngles;
    }

    public String getTallerDeporte() {
        return tallerDeporte;
    }

    public void setTallerDeporte(String tallerDeporte) {
        this.tallerDeporte = tallerDeporte;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public float getPromedioNotas() {
        return promedioNotas;
    }

    public void setPromedioNotas(float promedioNotas) {
        this.promedioNotas = promedioNotas;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombreAlumno=" + nombreAlumno + ", rut=" + rut + ", nivelIngles=" + nivelIngles + ", tallerDeporte=" + tallerDeporte + ", idAlumno=" + idAlumno + ", promedioNotas=" + promedioNotas + '}';
    }
    public void mostrarDatos()
    {
        System.out.println("**************************************");
        System.out.println("datos alumno");
        System.out.println("nombre: "+this.getNombreAlumno());
        System.out.println("rut: "+this.getRut());
        System.out.println("nivel ingles: "+this.getNivelIngles());
        System.out.println("taller: "+this.getTallerDeporte());
        System.out.println("id alumno: "+this.getIdAlumno());
        System.out.println("promedio: "+this.getPromedioNotas());
        System.out.println("**************************************");


    }
    
    public void validadId(Alumno alumno1,Apoderado apoderado1) {
        if (alumno1.getIdAlumno()==apoderado1.getIdrutApoderado()) 
        {
            System.out.println("id son validas, id alumno: "+alumno1.getIdAlumno()+", id apoderado: "+ apoderado1.getIdrutApoderado());
        }
        else if (alumno1.getIdAlumno()!=apoderado1.getIdrutApoderado()) 
        {
            System.out.println("los id no coinciden");
        }
            
        
    }
    
    
    public void editarPromedio (){}
}
