
import java.util.Scanner;


/**
 *
 * @author orlan
 */
public class SistemaInventario {
    public static void main(String[] args) {
        Scanner teclado  = new Scanner (System.in);
        Validacion val = new Validacion();
        Producto prod = null;
        Categoria cat=null;
        String  codigoCat , nomCat,descaCat,codProv,nomProv,contactoProv,nomProv;
        int opc ,precio,stock;
       
        do {
            
            System.out.println("______menu_____");
            System.out.println("1- ingresar categoria");
            System.out.println("2- ingresar proveedor");
            System.out.println("3- ingresar producto");
            System.out.println("4- mostrar producto ");
            System.out.println("5- salir");
            opc=teclado.nextInt();
            
            switch (opc) {
                case 1:
                    System.out.println("ingrese codigo categoria");
                    codigoCat=teclado.next();
                    System.out.println("ingrese nombre categoria");
                    nomCat=teclado.next();
                    teclado.nextLine();
                    System.out.println("descripcion de categoria");
                    descaCat=teclado.nextLine();
                    cat = new Categoria(codigoCat,nomCat,descaCat);
                        
                    break;
                case 2:
                     System.out.println("ingrese codigo proveedor");
                    codProv=teclado.next();
                    System.out.println("ingrese nombre proveedor");
                    nomProv=teclado.next();
                    teclado.nextLine();
                    System.out.println("contacto");
                    contactoProv=teclado.nextLine();
                    break;
                case 3:
                    break;
                case 4:
                    prod.mostrarInfoProducto();
                    break;
                case 5:
                    System.out.println("saliendo");
                    break;
                    
                default:
                    System.out.println("op no vslida");;
            }
        } while (opc !=5);
    }
}
