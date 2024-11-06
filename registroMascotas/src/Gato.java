/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orlan
 */
public class Gato extends Mascota {
    private String pedigri;

    public Gato() {
    }

    public Gato(String pedigri, String nombre, String idMascota, double peso, int edad, int diasAlojamiento, boolean reqVeterinario) {
        super(nombre, idMascota, peso, edad, diasAlojamiento, reqVeterinario);
        this.pedigri = pedigri;
    }

    public String getPedigri() {
        return pedigri;
    }

    public void setPedigri(String pedigri) {
        this.pedigri = pedigri;
    }

   

    
    @Override
    public void mostrarDatosmascota() {
        System.out.println("gato");
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
        System.out.println("pedigri "+this.getPedigri());
    }
        
    
}
