/**
 *
 * @author orlan
 */
public class Circulo {
    private final double PI = 3.14158765432675; // las constantes son en mayusculas
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    public double retornarPerimetro(){
        return 2*PI*radio;
    }
    
    
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(5);
        System.out.println(circulo1.retornarPerimetro());
        // PI=3.23; // esto no sirve ya que pi es una constante trate de cambiar el valor de pi
    }
}
