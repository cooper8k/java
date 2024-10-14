//1.- De un operario se conoce su sueldo y los años de antigüedad. Se pide confeccionar un
//programa que informe:
//a) Si el sueldo es inferior a 500 y su antigüedad es igual o superior a 10 años, otorgarle un
//aumento del 20 %, mostrar el sueldo a pagar. And && or ||
//b)Si el sueldo es inferior a 500 pero su antigüedad es menor a 10 años, otorgarle un aumento de 5%.
//c) Si el sueldo es mayor o igual a 500 mostrar el sueldo en pantalla sin cambios
/**
 *
 * @author orlan
 */
public class Test {
    public static void main(String[] args) {
        Trabajador tra1 = new Trabajador("angel",150000,12);
        Trabajador tra2 = new Trabajador("juan",120000,1);
        Trabajador tra3 = new Trabajador("pedro",500067,9);

        tra1.SubirSueldo();
        System.out.println("....................");
        tra2.SubirSueldo();
        System.out.println("....................");
        tra3.SubirSueldo();
    }
    
}
