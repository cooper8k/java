/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orlan
 */
public class Apoderado {
    private String nombreApoderado,rutApoderado,formaPago,alumno;
    private int idrutApoderado,nPupilos;

    public Apoderado() {
    }

    public Apoderado(String nombreApoderado, String rutApoderado, String formaPago, String alumno, int idrutApoderado, int nPupilos) {
        this.nombreApoderado = nombreApoderado;
        this.rutApoderado = rutApoderado;
        this.formaPago = formaPago;
        this.alumno = alumno;
        this.idrutApoderado = idrutApoderado;
        this.nPupilos = nPupilos;
    }

    public String getNombreApoderado() {
        return nombreApoderado;
    }

    public void setNombreApoderado(String nombreApoderado) {
        this.nombreApoderado = nombreApoderado;
    }

    public String getRutApoderado() {
        return rutApoderado;
    }

    public void setRutApoderado(String rutApoderado) {
        this.rutApoderado = rutApoderado;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public int getIdrutApoderado() {
        return idrutApoderado;
    }

    public void setIdrutApoderado(int idrutApoderado) {
        this.idrutApoderado = idrutApoderado;
    }

    public int getnPupilos() {
        return nPupilos;
    }

    public void setnPupilos(int nPupilos) {
        this.nPupilos = nPupilos;
    }

    @Override
    public String toString() {
        return "Apoderado{" + "nombreApoderado=" + nombreApoderado + ", rutApoderado=" + rutApoderado + ", formaPago=" + formaPago + ", alumno=" + alumno + ", idrutApoderado=" + idrutApoderado + ", nPupilos=" + nPupilos + '}';
    }
    
    public void mostrarDatos()
    {
        
        System.out.println("**************************************");
        System.out.println("datos apoderado");
        System.out.println("nombre: "+this.getNombreApoderado());
        System.out.println("rut: "+this.getRutApoderado());
        System.out.println("forma de pago: "+this.getFormaPago());
        System.out.println("alumno: "+this.getAlumno());
        System.out.println("id alumno: "+this.getIdrutApoderado());
        System.out.println("numero de pupilos: "+this.getnPupilos());
        System.out.println("**************************************");
    }
    
    
    public float descuento()
    {
        float descuento=0;
        if (this.getFormaPago().equalsIgnoreCase("pac")) 
        {
            descuento = 0.1f;
            System.out.println("decuento de: "+descuento+ "%" );
            
        }
        if (this.getFormaPago().equalsIgnoreCase("cheque")) 
        {
            descuento = 0.05f;
            System.out.println("decuento de: "+descuento+ "%" );
            
        }
        else if (this.getFormaPago().equalsIgnoreCase("efectivo")) 
        {
            System.out.println("no aplica descuento" );
            
        }
        if (this.getnPupilos() >1) 
        {
            descuento = descuento + 0.5f;
        }
        return descuento;
    }
    
    public float totalPagar()
    {
        float total=0;
        float descuento=0;
        // si numeros de pupilos es mayor a 1 entonces
        if (this.getnPupilos()>1)
        {
            descuento = descuento + 0.05f;
        }
        // aca en una variable le damos la cantidad de hijos que tenemos
        int cantidadHijos =this.getnPupilos();
        if (this.getFormaPago().equalsIgnoreCase("pac")) 
        {
            descuento = descuento + 0.1f;
            total = (150000 * cantidadHijos *10)*descuento;
        }
        else if (this.getFormaPago().equalsIgnoreCase("cheque")) 
        {
            descuento = descuento + 0.1f;
            total = (150000 * cantidadHijos *10)*descuento;
        }
        else if (this.getFormaPago().equalsIgnoreCase("efectivo"))
        {
            total = 150000 * cantidadHijos *10;
        }
        System.out.println("monto a pagar: "+total);
        return total;
    
    }

}