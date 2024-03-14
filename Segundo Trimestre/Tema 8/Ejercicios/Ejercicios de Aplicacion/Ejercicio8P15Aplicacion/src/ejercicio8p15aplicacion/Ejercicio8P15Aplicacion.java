package ejercicio8p15aplicacion;
import static netcat_utils.Colors.CYAN;

/**
 *
 * @author Samuel Vergara Martín
 */
public class Ejercicio8P15Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {;
        boolean sonIguales;
        Lista lista = new Lista();
        sonIguales = lista.equals(lista);
        if(sonIguales) System.out.println(CYAN + "Son iguales");
        else System.out.println(CYAN + "No son iguales");
    }
    
}
