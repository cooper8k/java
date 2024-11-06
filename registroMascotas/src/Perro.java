/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orlan
 */
public class Perro extends Mascota { 
    private int ejercicio;

    public Perro() {
    }

    public Perro(int ejercicio, String nombre, String idMascota, double peso, int edad, int diasAlojamiento, boolean reqVeterinario) {
        super(nombre, idMascota, peso, edad, diasAlojamiento, reqVeterinario);
        this.ejercicio = ejercicio;
    }

    public int isEjercicio() {
        return ejercicio;
    }

    public void setEjercicio(int ejercicio) {
        this.ejercicio = ejercicio;
    }

    
    @Override
    public void mostrarDatosmascota() {
        System.out.println("perro");
        System.out.println(".........");
        // estos 3 datos sirven
        System.out.println("nombre"+super.getNombre()); // ese
        System.out.println("codigo"+this.getIdMascota()); /// ese
        System.out.println("peso"+ peso); // ese
        System.out.println("edad"+super.getEdad());
        System.out.println("dias alojamiento"+diasAlojamiento);
        if (reqVeterinario) {
            System.out.println("requerie vet");
        } else {
            System.out.println(" no requiere vet");
        }
        if (this.ejercicio==0) {
            System.out.println(" sale a ejercitar ");
        }else {
            System.out.println("no sale a ejercitar");
        }
    }
    
    

    

    
    
    
    
    
    
}
