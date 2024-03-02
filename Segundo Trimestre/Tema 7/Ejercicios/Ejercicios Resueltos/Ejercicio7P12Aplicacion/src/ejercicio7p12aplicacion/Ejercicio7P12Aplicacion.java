package ejercicio7p12aplicacion;
import static netcat_utils.Colors.CYAN;
/**
 *
 * @author Samuel Vergara Martín
 */
public class Ejercicio7P12Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ecuacion ec = new Ecuacion(1, 4 , 1);
        double results1[];
        double results2[];
        
        results1 = ec.getResults();
        results2 = ec.getResults(50, 1000, 30);
        
        System.out.println(CYAN + "Lista de resultados de la primera ecuacion: " + java.util.Arrays.toString(results1));
        System.out.println(CYAN + "Lista de resultados de la segunda ecuacion: " + java.util.Arrays.toString(results2));
        
    }
    
}
