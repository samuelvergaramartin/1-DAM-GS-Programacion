package ejercicio7p15aplicacion;

/**
 *
 * @author Samuel Vergara Martín
 */
public class Ejercicio7P15Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calendario calendar = new Calendario(2024, 3, 2);
        //calendar.incrementarDia();
        calendar.mostrar();
        String fecha = "2/3/2024";
        boolean sonIguales;
        sonIguales = calendar.iguales(fecha);
        System.out.println(sonIguales);
        
    }
    
}
