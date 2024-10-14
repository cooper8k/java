
import java.util.Scanner;
/**
 *
 * @author orlan
 */
public class SistemaInventario {

    private static Proveedor Prov;
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        validacion val = new validacion ();
        Producto prod = null;
        Categoria cat= null;
        Proveedor prov =null;
        int op, precio, stock;
        String codCategoria,nomCategoria,desCategoria,codProveedor,nomProveedor,contactoProveedor,codigoProducto,nombreProducto;
        do {
            
            System.out.println("-----menu-----");
            System.out.println("1- categoria");
            System.out.println("2- ingresar preveedor");
            System.out.println("3-ingresar producto");
            System.out.println("4 mostrar producto");
            System.out.println("5- salir");
             op = leer.nextInt();
            
            switch (op) {
                case 1:
                    System.out.print("ingrese codigo categoria: ");
                    codCategoria = leer.next();
                    System.out.print("ingrese nombre categoria:  ");
                    nomCategoria=leer.next();
                    leer.nextLine();// esto es para que no se pase de largo  conn el netx line
                    System.out.print("ingrese:descripcion categoria:  ");
                    desCategoria =leer.nextLine();
                    
                    cat = new Categoria (codCategoria, nomCategoria, desCategoria);
                    break;
                 case 2:
                    System.out.print("ingrese codigo proveedor: ");
                    codProveedor = leer.next();
                    System.out.print("ingrese nombre proveedor:  ");
                    nomProveedor=leer.next();
                    leer.nextLine();// esto es para que no se pase de largo  conn el netx line
                    System.out.print("ingrese contacto proveedor:  ");
                    contactoProveedor= leer.next();
                     
                    prov = new Proveedor (codProveedor, nomProveedor, contactoProveedor);
                    break;
                            
                 case 3:
                    System.out.print("ingrese codigo producto: ");
                    codigoProducto = leer.next();
                    leer.nextLine();
                    System.out.print("ingrese nombre producto:  ");
                    nombreProducto=leer.next();
                    // esto es para que no se pase de largo  conn el netx line
                    if (val.validarNombre(nombreProducto)== false) {
                        System.out.println("error ingrese nombre el nuevamente ");
                        nombreProducto=leer.next();
                    } 
                     System.out.println(" ingrese precio producto ");
                     precio=leer.nextInt();
                     if (val.validarPrecio(precio)==false)
                         do {
                             System.out.println("error ingrese precio nuevamente ");
                             precio= leer.nextInt();
                         } while (val.validarPrecio(precio)==false);
                     
                     System.out.println("ingrese stock");
                     stock=leer.nextInt();
                     
                     prod = new Producto (codigoProducto, nombreProducto, precio, stock, prov, cat);
                         break;
                 case 4:
                     prod.mostrarInfoProducto();
                    break;
                 case 5:
                     System.out.println("saliendo . . .  ");
                    break;
                default: 
                    System.out.println("op no valida");
                    break;
            }
            
        } while (op !=5);
        
    }
}
