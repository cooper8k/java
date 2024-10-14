
/**
 *
 * @author orlan
 */
public class Figura {
    private int esquinasTriagnulo;

    public Figura() {
    }

    public Figura(int esquinasTriagnulo) {
        this.esquinasTriagnulo = esquinasTriagnulo;
    }

    public int getEsquinasTriagnulo() {
        return esquinasTriagnulo;
    }

    public void setEsquinasTriagnulo(int esquinasTriagnulo) {
        this.esquinasTriagnulo = esquinasTriagnulo;
    }

    @Override
    public String toString() {
        return "Figura{" + "esquinasTriagnulo=" + esquinasTriagnulo + '}';
    }
    // 2.- Realizar un programa que lea los lados de n triángulos, e informar:
// a) De cada uno de ellos, qué tipo de triángulo es: equilátero (tres lados iguales), isósceles (dos
// lados iguales), o escaleno (ningún lado igual)
// b) Cantidad de triángulos de cada tipo.
// c) Tipo de triángulo que posee menor cantidad.
    
    
    public void leerLados()
    {
        if (getEsquinasTriagnulo() ==3) 
        {
            System.out.println("es un triangulo equilatero");
        }
        if (getEsquinasTriagnulo()==2)
        {
            System.out.println(" es un triangulo isoceles ");
        } else 
        {
            System.out.println("es un escaleno");
        }
    }
    
}
