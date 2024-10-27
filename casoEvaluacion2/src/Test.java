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
        
        Portatil portatil1 = new Portatil(10, "nintendo", "n64", 140_000);
        Portatil portatil2 = new Portatil(11, "steam", "deak", 640_000);
        Portatil portatil3 = new Portatil(14, "nintendo", "wii", 340_000);
        Portatil portatil4 = new Portatil(21, "sony", "psp", 240_000);
        
        Sobremesa sobremesa1 = new Sobremesa(4, "xobox", "one", 200_000);
        Sobremesa sobremesa2 = new Sobremesa(2, "sony", "ps4", 180_000);
        Sobremesa sobremesa3 = new Sobremesa(1, "xobox", "seriesX", 800_000);
        Sobremesa sobremesa4 = new Sobremesa(3, "sony", "ps5", 700_000);
        
        RegistroConsola registro = new RegistroConsola();
        
        registro.agregarConsola(portatil1);
        registro.agregarConsola(portatil2);
        registro.agregarConsola(portatil3);
        registro.agregarConsola(portatil4);
        registro.agregarConsola(sobremesa1);
        registro.agregarConsola(sobremesa2);
        registro.agregarConsola(sobremesa3);
        registro.agregarConsola(sobremesa4);
        
        System.out.println("----------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------");
        registro.Listar();
        System.out.println("----------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------");
        registro.clasificacionConsolas();
        System.out.println("----------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------");
        registro.eliminarConsola("n64");
        System.out.println("----------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------");
        registro.Listar();
        System.out.println("----------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------");
        System.out.println("cantidad de consolas caras:  " + registro.obtenerConsolasCaras());
    }
    
    
    
}
