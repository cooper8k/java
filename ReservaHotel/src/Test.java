/**
 *
 * @author orlan
 */
public class Test {
    public static void main(String[] args) {
        Habitacion habitacion = new Habitacion ("A1",300_000,true);
        Habitacion habitacion2 = new Habitacion ("A2",400_000,false);
        
        Hotel hotel = new Hotel ("ABC1","HOTEL SHERATON ");
        
        hotel.agregarHabitacion(habitacion);
        hotel.agregarHabitacion(habitacion2);
        hotel.listarHabitacion();

        Reserva reserva1 = new Reserva(hotel, habitacion);
        Reserva reserv2  = new Reserva(hotel, habitacion2);
        
        Cliente cliente1 =new Cliente ("123","juan");
        Cliente cliente2 =new Cliente ("1234","juancho");
        
        cliente1.agregar(reserva1);
        cliente2.agregar(reserv2);
        cliente1.listar();
        cliente2.listar();
    }
}
