package ejercicio8p21aplicacion;
import static ejercicio8p21aplicacion.Clase.esNumero;
import static netcat_utils.NetCatConsole.printSeparator;
import static netcat_utils.Colors.CYAN;

/**
 *
 * @author Samuel Vergara Martín
 */
public class Ejercicio8P21Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean numero, sumable;
        Clase clase = new Clase();
        printSeparator();
        numero = esNumero(3);
        System.out.println(CYAN + "Result 1: " + numero);
        printSeparator();
        sumable = clase.sumar(2, 3);
        System.out.println(CYAN + "Result 2: " + sumable);
        printSeparator();
    }
    
}
