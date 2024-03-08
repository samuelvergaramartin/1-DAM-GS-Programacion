package ejercicio8p1;
import static netcat_utils.Colors.CYAN;
import static netcat_utils.NetCatConsole.printSeparator;
/**
 *
 * @author Samuel Vergara Martín
 */
public class Ejercicio8P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String currentValue;
        Hora hora = new Hora(10, 20);
        currentValue = hora.toString();
        System.out.println(CYAN + currentValue);
        printSeparator();
        hora.inc();
        currentValue = hora.toString();
        System.out.println(CYAN + currentValue);
        printSeparator();
        hora.setHora(20);
        hora.setMinutos(30);
        currentValue = hora.toString();
        System.out.println(CYAN + currentValue);
        printSeparator();
    }
    
}
