package ejercicio8p2;
import static netcat_utils.Colors.CYAN;
import static netcat_utils.NetCatConsole.printSeparator;
/**
 *
 * @author Samuel Vergara Martín
 */
public class Ejercicio8P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String currentValue;
        HoraExacta hora = new HoraExacta(10,0,0);
        currentValue = hora.toString();
        System.out.println(CYAN + currentValue);
        printSeparator();
        hora.setSegundo(20);
        currentValue = hora.toString();
        System.out.println(CYAN + currentValue);
        printSeparator();
        hora.inc();
        currentValue = hora.toString();
        System.out.println(CYAN + currentValue);
        printSeparator();
        hora.setMinutos(10);
        hora.setHora(20);
        currentValue = hora.toString();
        System.out.println(CYAN + currentValue);
        printSeparator();
    }
    
}
