/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orlan
 */
public class Sumar extends Operador {

    public Sumar(int numero1, int numero2) {
        super(numero1, numero2);
    }

    @Override
    public int operar() {
        resultado = numero1+numero2;
        return resultado;
    }
    // sobrecarga 
    public float operar(float numero1 , float numero2) {
       float  resultado = numero1+numero2;
        return resultado;
    }
   
    
}
