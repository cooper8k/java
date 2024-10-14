
import java.util.ArrayList;


/**
 *
 * @author orlan
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Operacion> lista1=new ArrayList<>();
        lista1.add(new Sumar(2,34));
        lista1.add(new Restar(200,34));
        lista1.add(new Dividir(20,3));
        lista1.add(new Multiplicar(22,34));
      
        
        for (Operacion i : lista1) {
            i.operar();
            i.imprimir();
        }
    }
}
