
/**
 *
 * @author orlan
 */
public class Restar extends Operacion {

    public Restar(int valo1, int valor2) {
        super(valo1, valor2);
    }
    
    

    @Override
    public void operar() {
        resultado=valo1-valor2;
        }


    
}
