

/**
 *
 * @author orlan
 */
public abstract class Operacion { // clase abstracta
    protected int valo1,valor2,resultado;

    public Operacion(int valo1, int valor2) {
        this.valo1 = valo1;
        this.valor2 = valor2;
    }
    
    public void imprimir(){
        System.out.println(resultado);
    }
    
    public abstract void operar();// metodo abstracto
}
