package actividad9p1;
import static netcat_utils.Colors.CYAN;
/**
 *
 * @author Samuel Vergara Martín
 */
public class Actividad9P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer resultado;
        Lista lista = new Lista();
        lista.encolar(2);
        lista.encolar(3);
        resultado = lista.desencolar();
        System.out.println(CYAN + resultado);
    }
    
}
