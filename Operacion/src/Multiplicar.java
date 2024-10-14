/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orlan
 */
public class Multiplicar extends Operacion{

    public Multiplicar(int valo1, int valor2) {
        super(valo1, valor2);
    }

    @Override
    public void operar() {
        resultado=valo1*valor2;
    }
    
}
